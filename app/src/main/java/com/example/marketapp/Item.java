package com.example.marketapp;

public class Item {
    int itemimg;
    String itemName,itemDesc;

    public Item(int itemimg, String itemName, String itemDesc) {
        this.itemimg = itemimg;
        this.itemName = itemName;
        this.itemDesc = itemDesc;
    }

    public int getItemimg() {
        return itemimg;
    }

    public void setItemimg(int itemimg) {
        this.itemimg = itemimg;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }
}
