package nLayeredDemo.entities.concretes;

import nLayeredDemo.entities.abstracts.Entity;

public class Product implements Entity {
    private int id;
    private int catogoryId;
    private String name;
    private double unitPricee;
    private int unitsInStock;

    public Product() {}

    public Product(int id, int catogoryId, String name, double unitPricee, int unitsInStock) {
        this.id = id;
        this.catogoryId = catogoryId;
        this.name = name;
        this.unitPricee = unitPricee;
        this.unitsInStock = unitsInStock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCatogoryId() {
        return catogoryId;
    }

    public void setCatogoryId(int catogoryId) {
        this.catogoryId = catogoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPricee() {
        return unitPricee;
    }

    public void setUnitPricee(double unitPricee) {
        this.unitPricee = unitPricee;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

}
