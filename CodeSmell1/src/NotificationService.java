public class NotificationService {
    public void sendNotification( String customerPhone, double finalPrice) {
        String message = "Pesanan Anda telah diproses dengan total: " + finalPrice;
        String action = "Mengirim pesan ke " + customerPhone + ": ";
        System.out.println( action + message );
    }
}
