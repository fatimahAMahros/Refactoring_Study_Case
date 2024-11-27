public class OrderCalculator {

    public double calculateFinalPrice(OrderModel order) {
        double finalPrice = order.getTotalPrice() + order.getTax();
        if (order.getDiscountCode() != null && !order.getDiscountCode().isEmpty()) {
            finalPrice -= applyDiscount(order.getDiscountCode(), order.getTotalPrice());
        }
        return finalPrice;
    }
    
    private double applyDiscount(String discountCode, double totalPrice) {
        return switch (discountCode) {
            case "DISC10" -> totalPrice * 0.10;
            case "DISC20" -> totalPrice * 0.20;
            default -> 0;
        };
    }

}
