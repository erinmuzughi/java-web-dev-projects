package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc {

    @Override
    public void spinDisc() {
        System.out.println("The rotational speed of this " + this.getMovieName() + " " + this.getMediaType() + " varies from "+ this.getGetSpinRateMax() + " rpm (revolutions per minute) when the inner edge is being read to " + this.getSpinRateMin() +" rpm when the outer edge is being read.\n\n");
    }

    @Override
    public void describe() {
        System.out.println("Movie Name: " + this.movieName + "\nGenre: " + this.genre + "\nRuntime: " + this.runtime + "\nRating: " + this.rating + "\n");
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    private String movieName;
    private String genre;
    private String runtime;
    private String rating;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public DVD(String mediaType, Double spinRateMin, Double getSpinRateMax, String movieName, String genre, String runtime, String rating) {
        super(mediaType, spinRateMin, getSpinRateMax);
        this.movieName = movieName;
        this.genre = genre;
        this.runtime = runtime;
        this.rating = rating;
    }

    public DVD(String mediaType, Double spinRateMin, Double getSpinRateMax, String movieName) {
        super(mediaType, spinRateMin, getSpinRateMax);
        this.movieName = movieName;
    }

}
