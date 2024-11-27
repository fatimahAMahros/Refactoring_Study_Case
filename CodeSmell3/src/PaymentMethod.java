public interface PaymentMethod {

    double calculateFee(double amount);
    void process() throws UnknownPaymentMethodException;
    
}
