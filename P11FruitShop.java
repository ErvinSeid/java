package L03VerConditionalStatementsAdvanced;

import java.util.Scanner;

public class P11FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        boolean isValidDay = day.equals("Monday") ||
                day.equals("Tuesday") ||
                day.equals("Wednesday") ||
                day.equals("Thursday") ||
                day.equals("Friday");

        boolean isNotValidDay = day.equals("Saturday") || day.equals("Sunday");

        boolean invalid = false;
        double price = 0;
        if (isValidDay) {

            if (fruit.equals("banana")) {
                price = 2.50;
            } else if (fruit.equals("apple")) {
                price = 1.20;
            } else if (fruit.equals("orange")) {
                price = 0.85;
            } else if (fruit.equals("kiwi")) {
                price = 2.70;
            } else if (fruit.equals("pineapple")) {
                price = 5.50;
            } else if (fruit.equals("grapes")) {
                price = 3.85;
            } else {
                invalid = true;
            }

        } else if (isNotValidDay) {
            if (fruit.equals("banana")) {
                price = 2.70;
            } else if (fruit.equals("apple")) {
                price = 1.25;
            } else if (fruit.equals("orange")) {
                price = 0.90;
            } else if (fruit.equals("grapefruit")) {
                price = 1.60;
            } else if (fruit.equals("kiwi")) {
                price = 3.00;
            } else if (fruit.equals("pineapple")) {
                price = 5.60;
            } else if (fruit.equals("grapes")) {
                price = 4.20;
            } else {
                invalid = true;
            }
        } else {
            invalid = true;
        }

        if (invalid) {
            System.out.println("error");
        } else {
            double finalPrice = price * quantity;
            System.out.printf("%.2f", finalPrice);
        }

    }

}