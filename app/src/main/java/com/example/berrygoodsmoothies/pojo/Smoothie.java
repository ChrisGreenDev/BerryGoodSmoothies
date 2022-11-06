package com.example.berrygoodsmoothies.pojo;

public class Smoothie {
    private int smoothieCard;

    public Smoothie(int smoothieCard) {
        this.smoothieCard = smoothieCard;
    }

    @Override
    public String toString() {
        return "Smoothie{" +
                "smoothieCard=" + smoothieCard;
    }

    public int getSmoothieCard() {
        return smoothieCard;
    }

    public void setSmoothieCard(int smoothieCard) {
        this.smoothieCard = smoothieCard;
    }
}
