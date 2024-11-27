public class PaypalPayment implements PaymentMethod{
    private final double FEE_PERCENTAGE = 0.03;

    @Override
    public double calculateFee(double amount) {
        return amount * FEE_PERCENTAGE;
    }

    @Override
    public void process() {
        System.err.println("Processing PayPal payment...");
    }

}
