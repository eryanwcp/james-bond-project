package com.coffeeshop.coffee;

/**
 * Created by Serkan.Tugrul on 07/06/2015.
 */
public class DrinkType {
    private String name;
    private String family;

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    //We don't care about boiler plate
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DrinkType drinkType = (DrinkType) o;

        if (name != null ? !name.equals(drinkType.name) : drinkType.name != null) return false;
        return !(family != null ? !family.equals(drinkType.family) : drinkType.family != null);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (family != null ? family.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "DrinkType{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                '}';
    }
}
