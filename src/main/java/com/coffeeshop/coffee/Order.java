package com.coffeeshop.coffee;

/**
 * Created by Serkan.Tugrul on 07/06/2015.
 */
public class Order {
//    {
//        "type": {
//        "name": "Cappuccino",
//                "family": "Coffee"
//    },
//        "size": "Small",
//            "drinker": "Serkan"
//    }

    private String id;
    private String size;
    private String drinker;
    private String[] selectedOptions;
    private DrinkType type;
    private long coffeeShopId;

    public String getId() {
        return id;
    }

    public String getSize() {
        return size;
    }

    public String getDrinker() {
        return drinker;
    }

    public String[] getSelectedOptions() {
        return selectedOptions;
    }

    public DrinkType getType() {
        return type;
    }

    public void setCoffeeShopId(long coffeeShopId) {
        this.coffeeShopId = coffeeShopId;
    }
}
