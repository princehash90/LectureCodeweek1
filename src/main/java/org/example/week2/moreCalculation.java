package org.example.week2;

import java.text.NumberFormat;

import static input.InputUtils.doubleInput;
import static input.InputUtils.yesNoInput;

public class moreCalculation {
    public static void main(String[] args) {
        boolean moreCalculation= true;
        double price;
        double salesTax= 1.07;

        while (moreCalculation) {
            price = doubleInput("Type a price");
            double priceIncTax = price * salesTax;
            NumberFormat currencyformatter = NumberFormat.getCurrencyInstance();
            // the above line formats the PriceIncTax into currency
            //importing NumberFormat allows numbers to be formatted
            String formattedPrice = currencyformatter.format(priceIncTax);
            System.out.println("the price plus sales tax is " + formattedPrice);
            moreCalculation = yesNoInput("Do you want to continue");
            // asking if the user want to continue
        }
        System.out.println("Thank you ");

        }
    }

