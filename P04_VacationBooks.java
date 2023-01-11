package L01_Uprajneniq;

import java.util.Scanner;

public class P04_VacationBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Брой страници в текущата книга – цяло число в интервала [1…1000]
        // 2. Страници, които прочита за 1 час – цяло число в интервала [1…1000]
        // 3. Броят на дните, за които трябва да прочете книгата – цяло число в интервала [1…1000]
        // Да се отпечата на конзолата броят часове, които Жоро трябва да отделя за четене всеки ден.

        int numPages = Integer.parseInt(scanner.nextLine());
        int pagesPH = Integer.parseInt(scanner.nextLine());
        int numDays = Integer.parseInt(scanner.nextLine());

        int hoursB =numPages / pagesPH;

        int totalHoursBook = hoursB / numDays;

                System.out.println(totalHoursBook);



    }
}
