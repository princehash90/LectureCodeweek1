package org.example.week2;

public class Distance {
    public static void main(String[] args) {
        double[] miles = {1,4,10};
        double[] kilometers= new  double[miles.length];

        for ( int x=0; x<miles.length;x++){
            double km = miles[x] * 1.6;
            kilometers[x]=km;
        }
        for ( int x= 0; x<miles.length; x++){
            System.out.println(miles[x] + " Miles is equal " +kilometers[x] + " Kilometers");
        }
    }
}
