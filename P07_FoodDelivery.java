package L01_Uprajneniq;

import java.util.Scanner;

public class P07_FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Пилешко меню – 10.35 лв
           Меню с риба – 12.40 лв.
           Вегетарианско меню – 8.15 лв

           колко ще струва на група хора да си поръчат храна за вкъщи.
           Групата ще си поръча и десерт, чиято цена е равна на 20% от общата сметка (без доставката).
           Цената на доставка е 2.50 лв и се начислява най-накрая
           \
           \Брой пилешки менюта – цяло число в интервала [0 … 99]
           Брой менюта с риба – цяло число в интервала [0 … 99]
           Брой вегетариански менюта – цяло число в интервала [0 … 99

           Да се отпечата на конзолата един ред: "{цена на поръчката}"*/

        int chixM = Integer.parseInt(scanner.nextLine());
        int fishM = Integer.parseInt(scanner.nextLine());
        int vegieM = Integer.parseInt(scanner.nextLine());

        double totalFood = (chixM * 10.35) + (fishM * 12.40) + (vegieM * 8.15);
        double desert = totalFood * 0.20;
        double totalNoDel = totalFood + desert;
        double totalAmount = totalNoDel + 2.50;

        System.out.println(totalAmount);
    }
}
