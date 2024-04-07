package org.example.week7;

public class pool {
    private  String name;// field or a variable in class
    private  double length;// field to store length

    public pool(String name, double length){// this is a constructor, should be the same as the class name
        //contructor is method and does not return anything.
        this.name= name;// this. refers to the name above
        this.length=length;// this refers to length above
    }
    // a method that belongs to class is called instance method
    // an instance is another word for class
    // a pool object is another instance of the Pool Class
    public double distanceForLaps(int laps){// this is a method that multiples the laps by the length
        // 10 laps of length 50, that is 500 meters
        double total = laps * this.length;// this. refers to the variable defined in the class
        return total;
    }
    @Override
    //checks method name to make sure it is correct
    //helps in using the customized rather than using the inbuilt
    public String toString(){
        String description = this.name + "Pool is "+this.length + " meters long.";
        return description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <0 || length >1000){
            System.out.println(" Ooops ");
        }
        this.length = length;
    }
}
