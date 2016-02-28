package contests.thirtyDaysOfCode.dayTwo;

import java.util.Scanner;

/**
 * Created by Nick on 1/24/2016.
 */
public class Arithmetic {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double mealPrice = input.nextDouble();
        int tipPercentage = input.nextInt();
        int taxPercentage = input.nextInt();

        double tipPrice = (mealPrice*tipPercentage)/100;
        double taxPrice = (mealPrice*taxPercentage)/100;

        int totalPrice = (int) Math.round(mealPrice + tipPrice + taxPrice);

        System.out.println("The final price of the meal is $" + totalPrice + ".");
    }

}