package shop;

import behaviours.ISell;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public int stockCount(){
        return this.stock.size();
    }

    public String getName() {
        return this.name;
    }

    public void addToStock(ISell newItem) {
        this.stock.add(newItem);
    }
}
