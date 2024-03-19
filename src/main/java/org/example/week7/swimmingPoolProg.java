package org.example.week7;

public class swimmingPoolProg {
    public static void main(String[] args) {
        pool ymca = new pool("ymca", 50);

        double totalSwam = ymca.distanceForLaps(6);
        System.out.println("The total distance "+ totalSwam + "meters");

    }


}
