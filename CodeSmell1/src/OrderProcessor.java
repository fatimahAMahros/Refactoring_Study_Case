public class OrderProcessor {
    private OrderCalculator calculator;
    private OrderModel order;
    private NotificationService notification;

    public void processOrder(OrderCalculator orderCalculator, OrderModel orderModel, NotificationService notificationService) {
        this.calculator = orderCalculator;
        this.order = orderModel;
        this.notification = notificationService;
        
        if (order.isOrderInvalid()) {
            System.out.println("Pesanan tidak valid");
            return;
        }
        
        double finalPrice = calculator.calculateFinalPrice(order);
        
        saveOrder(order);
        notification.sendNotification(order.getCustomerPhone(), finalPrice);
    }

    private void saveOrder(OrderModel order) {
        System.out.println("Pesanan disimpan ke database: " + order.getOrderId());
    }
}
