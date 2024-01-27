package org.example.Week1;

import static input.InputUtils.*;

public class prices {
    public static void main(String[] args) {
        String productName= stringInput("Please enter the name of the product");
        double priceProduct = positiveDoubleInput("what is the price of the product"); // rejects negative inputs
        int quantity = positiveIntInput("Enter the quanitiy");
        double total = priceProduct * quantity;
        System.out.println("your total price is $" +total);
        System.out.printf("%d of %s at $%.2f each cost $.2f", quantity,productName,priceProduct,total);



    }


}
