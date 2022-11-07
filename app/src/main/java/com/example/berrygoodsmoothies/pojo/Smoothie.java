package com.example.berrygoodsmoothies.pojo;

public class Smoothie {
    private int smoothieCard;
    private String smoothieName;
    private String smoothieDescription;

    public Smoothie(int smoothieCard, String smoothieName, String smoothieDescription) {
        this.smoothieCard = smoothieCard;
        this.smoothieName = smoothieName;
        this.smoothieDescription = smoothieDescription;
    }

    @Override
    public String toString() {
        return "Smoothie{" +
                "smoothieCard=" + smoothieCard +
                ", smoothieName='" + smoothieName + '\'' +
                ", smoothieDescription='" + smoothieDescription + '\'' +
                '}';
    }

    public int getSmoothieCard() {
        return smoothieCard;
    }

    public void setSmoothieCard(int smoothieCard) {
        this.smoothieCard = smoothieCard;
    }

    public String getSmoothieName() {
        return smoothieName;
    }

    public void setSmoothieName(String smoothieName) {
        this.smoothieName = smoothieName;
    }

    public String getSmoothieDescription() {
        return smoothieDescription;
    }

    public void setSmoothieDescription(String smoothieDescription) {
        this.smoothieDescription = smoothieDescription;
    }
}
