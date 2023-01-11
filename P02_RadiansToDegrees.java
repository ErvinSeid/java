package L01_Uprajneniq;

import java.util.Scanner;

public class P02_RadiansToDegrees {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // градус = радиан * 180 / π

        double radian = Double.parseDouble(scanner.nextLine());

        double degrees = radian *180 / Math.PI;

        System.out.println(degrees);
    }
}
