public class TicketCancel {
    public void cancelTicket(Ticket ticket) {
        System.out.println("Memproses pembatalan tiket...");
        ticket.printTicketDetails();
        System.out.println("Pesanan dibatalkan.");
    }
}
