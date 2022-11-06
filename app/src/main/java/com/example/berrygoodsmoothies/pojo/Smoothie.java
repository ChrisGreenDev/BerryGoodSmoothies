package com.example.berrygoodsmoothies.pojo;

public class Smoothie {
    private int smoothieCard;
    private String smoothieName;

    public Smoothie(int smoothieCard, String smoothieName) {
        this.smoothieCard = smoothieCard;
        this.smoothieName = smoothieName;
    }

    @Override
    public String toString() {
        return "Smoothie{" +
                "smoothieCard=" + smoothieCard +
                ", smoothieName='" + smoothieName + '\'' +
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
}
