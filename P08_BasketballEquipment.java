package L01_Uprajneniq;

import java.util.Scanner;

public class P08_BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Напишете програма, която изчислява какви разходи ще има Джеси,
        ако започне да тренира, като знаете колко е таксата за тренировки
        по баскетбол за период от 1 година. Нужна екипировка:

        • Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        • Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        • Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        • Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка
                             ВХОД
           · Годишната такса за тренировки по баскетбол – цяло число в интервала [0… 9999
                             ИЗХОД
           Да се отпечата на конзолата колко ще са разходите на Джеси,
            ако започне да спортува баскетбол.
         */

        double yearlyTax = Double.parseDouble(scanner.nextLine());

        double shoes = yearlyTax - (yearlyTax * 0.40);
        double suit = shoes - (shoes * 0.20 );
        double ball = suit / 4;
        double accessoars = ball / 5;

        double yearlyTotal = shoes + suit + ball + accessoars + yearlyTax;

        System.out.println(yearlyTotal);

    }
}
