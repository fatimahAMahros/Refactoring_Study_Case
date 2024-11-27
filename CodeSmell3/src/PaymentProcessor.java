public class PaymentProcessor {

    public double processPayment(PaymentMethod paymentMethod, double amount) {

        try {
            paymentMethod.process();
            double fee = paymentMethod.calculateFee(amount);
            return amount + fee;
        } catch (UnknownPaymentMethodException e) {
            System.out.println("Unknown payment method.");
            return 0;
        }

    }
}
