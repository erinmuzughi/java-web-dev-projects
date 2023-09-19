package org.launchcode;

public abstract class BaseDisc {
    private String mediaType;
    private Double spinRateMin;
    private Double getSpinRateMax;


    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public Double getSpinRateMin() {
        return spinRateMin;
    }

    public void setSpinRateMin(Double spinRateMin) {
        this.spinRateMin = spinRateMin;
    }

    public Double getGetSpinRateMax() {
        return getSpinRateMax;
    }

    public void setGetSpinRateMax(Double getSpinRateMax) {
        this.getSpinRateMax = getSpinRateMax;
    }

    public BaseDisc(String mediaType, Double spinRateMin, Double getSpinRateMax) {
        this.mediaType = mediaType;
        this.spinRateMin = spinRateMin;
        this.getSpinRateMax = getSpinRateMax;
    }
}
