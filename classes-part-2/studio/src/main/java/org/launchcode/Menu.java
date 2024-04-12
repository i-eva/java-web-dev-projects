package org.launchcode;

import java.time.LocalDate; // import the LocalDate class
// LocalDate myObj = LocalDate.now(); // Create a date object
// System.out.println(myObj); // Display the current date

public class Menu {
    private LocalDate lastUpdated = LocalDate.now();
    private ArrayList<MenuItem> items;

    public Menu(LocalDate d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }
}


