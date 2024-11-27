public class Movie {
    private String movieTitle;
    private String movieDate;
    private String movieTime; 
    public Movie(String movieDate, String movieTime, String movieTitle) {
        this.movieDate = movieDate;
        this.movieTime = movieTime;
        this.movieTitle = movieTitle;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMovieDate() {
        return movieDate;
    }

    public String getMovieTime() {
        return movieTime;
    }

    public void setMovieDate(String movieDate) {
        this.movieDate = movieDate;
    }

    public void setMovieTime(String movieTime) {
        this.movieTime = movieTime;
    }
    
}
