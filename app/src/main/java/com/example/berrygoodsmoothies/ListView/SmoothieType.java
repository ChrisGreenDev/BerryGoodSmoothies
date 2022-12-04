package com.example.berrygoodsmoothies.ListView;

public class SmoothieType {

    private String listViewTitle;
    private int listViewImage;

    public SmoothieType(int listViewImage, String listViewTitle) {
        this.listViewImage = listViewImage;
        this.listViewTitle = listViewTitle;
    }

    @Override
    public String toString() {
        return "SmoothieType{" +
                "listViewTitle='" + listViewTitle + '\'' +
                ", listViewImage=" + listViewImage +
                '}';
    }

    public String getListViewTitle() {
        return listViewTitle;
    }

    public void setListViewTitle(String listViewTitle) {
        this.listViewTitle = listViewTitle;
    }

    public int getListViewImage() {
        return listViewImage;
    }

    public void setListViewImage(int listViewImage) {
        this.listViewImage = listViewImage;
    }
}
