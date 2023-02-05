package L03VerConditionalStatementsAdvanced;

import java.util.Scanner;

public class P10InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());

        boolean isValid = number >= 100 && number <= 200|| number == 0;

        if (!isValid){
            System.out.println("invalid");
        }
    }
}