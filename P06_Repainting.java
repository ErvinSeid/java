package L01_Uprajneniq;

import java.util.Scanner;

public class P06_Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* · Предпазен найлон - 1.50 лв. за кв. метър
           · Боя - 14.50 лв. за литър
           · Разредител за боя - 5.00 лв. за литър
         За всеки случай, към необходимите материали,
         Румен иска да добави още 10% от количеството боя
         и 2 кв.м. найлон, разбира се и 0.40 лв. за торбички.
         Сумата, която се заплаща на майсторите за 1 час работа,
         е равна на 30% от сбора на всички разходи за материали.

         Входът се чете от конзолата и съдържа точно 4 реда:
           1. Необходимо количество найлон (в кв.м.) - цяло число в интервала [1... 100]
           2. Необходимо количество боя (в литри) - цяло число в интервала [1…100]
           3. Количество разредител (в литри) - цяло число в интервала [1…30]
           4. Часовете, за които майсторите ще свършат работата - цяло число в интервала [1…9]

           Да се отпечата на конзолата един ред:
           "{сумата на всички разходи}"
         */

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thicker = Integer.parseInt(scanner.nextLine());
        int workH = Integer.parseInt(scanner.nextLine());

        double nylonPr = (nylon + 2) * 1.50;
        double paintPr = (14.5 * paint) + (paint * 14.5 * 0.10 );
        double thickerPr = (thicker * 5.00) ;
        double totalSuply = nylonPr + paintPr + thickerPr + 0.40;

        double masterSalary = workH * (totalSuply * 0.30);

        double total = totalSuply + masterSalary;

        System.out.println(total);

    }
}
