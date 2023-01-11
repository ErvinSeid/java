import java.util.Scanner;

public class P09_FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        /* Един литър вода се равнява на един кубичен дециметър/ 1л=1 дм3/.
        Първоначално прочитаме от конзолата на отделни
        редове размерите му – дължина, широчина и височина в сантиметри.
        Да се напише програма, която изчислява литрите вода,
        която са необходими за напълването на аквариума.
           1. Дължина в см – цяло число в интервала [10 … 500]
           2. Широчина в см – цяло число в интервала [10 … 300]
           3. Височина в см – цяло число в интервала [10… 200]
           4. Процент – реално число в интервала [0.000 … 100.000]
         */


        int leght = Integer.parseInt(scanner.nextLine());
        int wide = Integer.parseInt(scanner.nextLine());
        int high = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volume = leght * wide * high;
        double litters = volume * 0.001;
        double stuff = (percent / 100);
        double totalLitters = litters * (1 - stuff);


        System.out.println(totalLitters);




    }
}
