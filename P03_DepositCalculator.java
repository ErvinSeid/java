package L01_Uprajneniq;

import java.util.Scanner;

public class P03_DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // сума = депозирана сума + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
        // 1. Депозирана сума – реално число в интервала [100.00 … 10000.00]
        //2. Срок на депозита (в месеци) – цяло число в интервала [1…12]
        //3. Годишен лихвен процент – реално число в интервала [0.00 …100.00]

        double deposit = Double.parseDouble(scanner.nextLine());
        double depDate = Double.parseDouble(scanner.nextLine());
        double APY = Double.parseDouble(scanner.nextLine());

        double amount = deposit + depDate * ((deposit * APY * 0.01) / 12);

        System.out.println(amount);
    }
}
