package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc {
    // TODO: Implement your custom interface.
    @Override
    public void spinDisc() {
        System.out.println("The rotational speed of this " + this.getArtist() + " " + this.getAlbum() + " " + getMediaType() + " varies from "+ getGetSpinRateMax() + " rpm (revolutions per minute) when the inner edge is being read to " + getSpinRateMin() +" rpm when the outer edge is being read.\n\n");
    }

    @Override
    public void describe() {
        System.out.println("Artist: " + this.artist + "\nAlbum Name: " + this.album + "\n");
    }
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    private String artist;
    private String album;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public CD(String mediaType, Double spinRateMin, Double getSpinRateMax, String artist, String album) {
        super(mediaType, spinRateMin, getSpinRateMax);
        this.artist = artist;
        this.album = album;
    }

}
