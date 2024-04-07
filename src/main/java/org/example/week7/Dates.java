package org.example.week7;

import java.util.Date;

public class Dates {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);// this print hthe current date and time

        // number of milliseconds since midnight January 1,1970, UTC
        System.out.println(now.getTime());

        // it is stored in long not int
        long millisecond = now.getTime();
        System.out.println(millisecond);

        long numberOfMilliscond = 3445858392187L;
        Date date2023 =new Date(numberOfMilliscond);
        System.out.println(date2023);

        if (date2023.before(now)){
            System.out.println("this is before");
        }else {
            System.out.println("This is long after 2023");
        }


    }
}
