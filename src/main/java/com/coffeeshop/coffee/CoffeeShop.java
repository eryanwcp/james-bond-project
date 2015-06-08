package com.coffeeshop.coffee;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Serkan.Tugrul on 08/06/2015.
 */
public class CoffeeShop {
    private String name;
    private String address;
    public Map<String, CoffeeShop> coffeeShopMap;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public CoffeeShop(String region) {
        coffeeShopMap = new HashMap<String, CoffeeShop>();
        addCoffeeShopIntoMap();
    }

    public CoffeeShop(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addCoffeeShopIntoMap(){
        coffeeShopMap.put("Finchley", new CoffeeShop("Starbucks Coffee", "811 High Road, London N12 8JR"));
        coffeeShopMap.put("Islington", new CoffeeShop("Pret A Manger", "27 Islington High Street, London N1 9LH"));
        coffeeShopMap.put("Barnet", new CoffeeShop("Costa Cafe", "Unit 28, The Spires Shopping Centre, Barnet, Hertfordshire EN5 5XY"));
        coffeeShopMap.put("Croydon", new CoffeeShop("Cafe Nero", "44 George Street, Croydon CR0 1PB"));
    }

    public CoffeeShop getCoffeeShopFromMap(String region) {
        return coffeeShopMap.get(region);
    }


}
