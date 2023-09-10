package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date date, ArrayList<MenuItem> items) {
        this.lastUpdated = date;
        this.items = items;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void addMenuItem(MenuItem item) {
        this.items.add(item);
    }

    public void removeMenuItem(MenuItem item) {
        this.items.remove(item);
    }

    public boolean checkNew(MenuItem item) {
        return item.isNew();
    }

    public void printItem(MenuItem item) {
    }

    public void printMenu() {
    }
}


