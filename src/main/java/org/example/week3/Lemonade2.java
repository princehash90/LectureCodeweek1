package org.example.week3;

import static input.InputUtils.doubleInput;
import static input.InputUtils.intInput;

public class Lemonade2 {
    public static void main(String[] args) {

        double lemonadeSuppliesCost= doubleInput("How much did you spend on lemonade supplies");
        double lemonadeSalesPrice= doubleInput("what did you sell one cup of lemonade for");
        int lemonadeCupsSold= intInput("How many cups of Lemonade did you sell");
        double cookieSupplyCost= doubleInput("How much did you spend on cookie supply");
        double cookieSalesPrice = doubleInput("How did you sell one cookie for");
        int cookiesSold = intInput("How many cookies did you sell");
        double totalSales =sales(lemonadeSalesPrice,lemonadeCupsSold);

    }
    public static double sales( double numberOfSale, int numberOfCup ){
        double totalSales = numberOfSale * numberOfCup;
        return totalSales;
    }

    public static double calculateProfit(double sales, double cost ){
        double profit= sales-cost;
        return profit;
    }

}
