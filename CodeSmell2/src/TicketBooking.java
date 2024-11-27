public class TicketBooking {
    
    public void bookTicket(Ticket ticket) {
        System.out.println("Memproses pemesanan tiket...");
        ticket.printTicketDetails();
        System.out.println("Pesanan selesai.");
    }
}
