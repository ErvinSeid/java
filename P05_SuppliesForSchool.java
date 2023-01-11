package L01_Uprajneniq;

import java.util.Scanner;

public class P05_SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* ценоразпис:
        • Пакет химикали - 5.80 лв.
        • Пакет маркери - 7.20 лв.
        • Препарат - 1.20 лв (за литър)

        · Брой пакети химикали - цяло число в интервала [0...100]
        · Брой пакети маркери - цяло число в интервала [0...100]
        · Литри препарат за почистване на дъска - цяло число в интервала [0…50]
        · Процент намаление - цяло число в интервала [0...100]*/


        int penPk = Integer.parseInt(scanner.nextLine());
        int markerPk = Integer.parseInt(scanner.nextLine());
        int deterjanL = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double penPrice = penPk * 5.80;
        double marPrice = markerPk * 7.20;
        double detPrice = deterjanL * 1.20;
        double discPer = discount;


        double totalPrice = penPrice + marPrice + detPrice;
        double totWdis = totalPrice - (totalPrice * discPer / 100);

        System.out.println(totWdis);


    }
}
