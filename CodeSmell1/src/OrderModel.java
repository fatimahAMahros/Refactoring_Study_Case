import java.util.List;

public class OrderModel {
    private String orderId;
    private String customerName;
    private String customerPhone;
    private String customerAddress;
    private List<String> menuItems;
    private double totalPrice;
    private double tax;
    private String paymentMethod;
    private String discountCode;

    public OrderModel(String orderId, String customerName, String customerPhone, String customerAddress, List<String> menuItems, double totalPrice, double tax, String paymentMethod, String discountCode) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.customerAddress = customerAddress;
        this.menuItems = menuItems;
        this.totalPrice = totalPrice;
        this.tax = tax;
        this.paymentMethod = paymentMethod;
        this.discountCode = discountCode;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double getTax() {
        return tax;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<String> getMenuItems() {
        return menuItems;
    }
    
    public String getCustomerAddress() {
        return customerAddress;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public boolean isOrderInvalid() {
        return orderId == null && 
               customerName == null && 
               customerPhone == null && 
               menuItems == null && 
               totalPrice <= 0;
    }

}
