package hr.dabo.bitsandpizzas;

/**
 * Created by Damjan on 14-Apr-17.
 */

public class Pizza {
    private String name;
    private int imageResourceId;

    public static final Pizza[] pizzas = {
            new Pizza("Diavolo", R.drawable.diavolo),
            new Pizza("Funghi", R.drawable.funghi),
            new Pizza("Capriciosa", R.drawable.capriciosa),
            new Pizza("Pepperoni", R.drawable.pepperoni),
            new Pizza("Margarita", R.drawable.margarita)
    };

    public Pizza(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
