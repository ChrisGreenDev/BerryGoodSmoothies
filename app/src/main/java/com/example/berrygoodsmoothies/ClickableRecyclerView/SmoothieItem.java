package com.example.berrygoodsmoothies.ClickableRecyclerView;

public class SmoothieItem {

    private int drawable;
    private String name;
    private String ingredients;

    public SmoothieItem(int drawable, String name, String ingredients) {
        this.drawable = drawable;
        this.name = name;
        this.ingredients = ingredients;
    }

    public SmoothieItem(int drawable, String name) {
        this.drawable = drawable;
        this.name = name;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
}
