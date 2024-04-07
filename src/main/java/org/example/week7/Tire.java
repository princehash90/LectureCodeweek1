package org.example.week7;

public class Tire implements Comparable<Tire> {
    // adding comparable to help Java understand the type of data we are trying to sort
    // it provides compareTo Method to compare one tire to another tire
    private String name;
    private double price;
    private double warrantyMiles;

    public Tire(String name, double price, double warrantyMiles) {// this is the constructor which has the same name as the class
        this.name = name;
        this.price = price;
        this.warrantyMiles = warrantyMiles;
    }

    public double pricePer1000Miles(){// method to get price per 1000 miles
        double pricePer1000 = (this.price /this.warrantyMiles) *1000;
        return pricePer1000;
    }
    @Override
    public String toString(){// this methods converts to string
        //return "This tire is called "+ name;
        String tireName = this.name + " priced at $"+ this.price +" has a "+this.warrantyMiles +" miles warranty";
        return tireName;
    }

    public double costForSet(){// method to calculate cost for a set
        return this.price *4;
    }

    @Override
    public int compareTo(Tire otherTire) {// this method is added to help collection.sort
        return Double.compare(this.pricePer1000Miles(),otherTire.pricePer1000Miles());
        //we can also sort by the name
        //return this.name.compareTo(otherTire.name);
        //comparing the prices of tires to help Collection .sort
    }
}
