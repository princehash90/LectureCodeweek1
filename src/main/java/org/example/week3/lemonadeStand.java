package org.example.week3;

import static input.InputUtils.doubleInput;
import static input.InputUtils.intInput;

public class lemonadeStand {
    public static void main(String[] args) {
        double cookieProfit = calculateProfitForProduct(" Cookie");
        double lemonadeProfit = calculateProfitForProduct(" cups of Lemonade");
        double coffeeProfit = calculateProfitForProduct(" cups of coffee");
        System.out.println(" your profit for cookies is $" +cookieProfit );
        System.out.println(" your profit for lemonade is $" + lemonadeProfit);
        System.out.println(" your profit for lemonade is $" + coffeeProfit);
    }
    public static double calculateProfitForProduct (String productName){
        double SuppliesCost= doubleInput("How much did you spend on " + productName + " on supplies");
        double SalesPrice= doubleInput("what did you sell one " + productName + " for");
        int CupsSold= intInput("How many did you sell " + productName);

        double profit = (SalesPrice * CupsSold)-SuppliesCost;
        return profit;

    }
}
