public class Ticket {
    private String customerName;
    private String customerPhone; 
    private String customerEmail; 
    private String seatNumber;
    private Movie movie;

    public Ticket(String customerEmail, String customerName, String customerPhone, String seatNumber, Movie movie) {
        this.customerEmail = customerEmail;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.seatNumber = seatNumber;
        this.movie = movie;
    }
    
    public void printTicketDetails() {
        System.out.println("Pelanggan: " + customerName + ", " + customerPhone + ", " + customerEmail);
        System.out.println("Film: " + movie.getMovieTitle() + " pada " + movie.getMovieDate() + " jam " + movie.getMovieTime());
        System.out.println("Kursi: " + seatNumber);
    }

    public void printTicketDetails(String newDate, String newTime) {
        System.out.println("Pelanggan: " + customerName + ", " + customerPhone + ", " + customerEmail);
        System.out.println("Film: " + movie.getMovieTitle());
        System.out.println("Jadwal lama: " + movie.getMovieDate() + " jam " + movie.getMovieTime());
        movie.setMovieDate(newDate);
        movie.setMovieTime(newTime);
        System.out.println("Jadwal baru: " + newDate + " jam " + newTime);
        System.out.println("Kursi: " + seatNumber);
    }

    
}
