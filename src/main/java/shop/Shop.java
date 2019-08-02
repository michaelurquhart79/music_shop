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

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addToStock(ISell newItem) {
        this.stock.add(newItem);
    }

    public void removeFromStock(ISell item) {
        this.stock.remove(item);
    }

    public int totalPotentialProfit() {
        int profit = 0;
        for (ISell stockItem: this.stock) {
            profit += stockItem.calculateMarkup();
        }
        return profit;
    }
}
