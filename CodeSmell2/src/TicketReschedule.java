public class TicketReschedule {
    public void rescheduleTicket(Ticket ticket, String newDate, String newTime) {
        
        System.out.println("Memproses penggantian jadwal tiket...");
        ticket.printTicketDetails(newDate, newTime);
        System.out.println("Jadwal berhasil diganti.");
    }
}
