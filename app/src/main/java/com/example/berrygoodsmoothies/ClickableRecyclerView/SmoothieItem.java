package com.example.berrygoodsmoothies.ClickableRecyclerView;

public class SmoothieItem {

    private int drawable;
    private int drawable2;
    private String name;
    private String ingredients;
    private String ingredientsList;
    private String serving;

    public SmoothieItem(int drawable,int drawable2, String name, String ingredients, String ingredientsList, String serving) {
        this.drawable = drawable;
        this.drawable2 = drawable2;
        this.name = name;
        this.ingredients = ingredients;
        this.ingredientsList = ingredientsList;
        this.serving = serving;
    }

    public SmoothieItem(int drawable, String name) {
        this.drawable = drawable;
        this.name = name;
    }

    public SmoothieItem(int drawable2, String name, String ingredientsList) {
        this.drawable = drawable2;
        this.name = name;
        this.ingredientsList = ingredientsList;
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

    public String getIngredientsList() {
        return ingredientsList;
    }

    public void setIngredientsList(String ingredientsList) {
        this.ingredientsList = ingredientsList;
    }

    public int getDrawable2() {
        return drawable2;
    }

    public void setDrawable2(int drawable2) {
        this.drawable2 = drawable2;
    }

    public String getServing() {
        return serving;
    }

    public void setServing(String serving) {
        this.serving = serving;
    }
}
