package L03VerConditionalStatementsAdvanced;

import java.util.Scanner;

public class P08CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Friday":
                day = "12";
                break;
            case "Wednesday":
            case "Thursday":
                day = "14";
                break;
            case "Saturday":
            case "Sunday":
                day = "16";
        }
        System.out.println(day);
    }
}
