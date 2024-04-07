package org.example.week7;

public class swimmingPoolProg {
    public static void main(String[] args) {
        pool ymca = new pool("ymca ", 50);

        //ymca.name = "Ymca" not allowed because name has a private access

        ymca.setName(" Minneapolis YMCA ");

        double totalSwam = ymca.distanceForLaps(6);// calling the method for the pool object

        System.out.println(ymca);

        System.out.println("The total distance "+ totalSwam + "meters");

        // you can create as many object or instance

        pool como = new pool("Como Park ", 25);
        System.out.println(como.distanceForLaps(10));

        System.out.println(como);

        pool Edina = new pool("Edina ", 50);
        System.out.println(Edina.distanceForLaps(12));

        System.out.println(Edina);
    }


}
