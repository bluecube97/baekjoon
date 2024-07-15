package bj_24_07_15_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Month = sc.nextInt();
        int Day = sc.nextInt();

        if (Month < 2) {
            System.out.println("Before");
        } else if (Month > 2) {
            System.out.println("After");
        } else {
            if (Day < 18) {
                System.out.println("Before");
            } else if (Day > 18) {
                System.out.println("After");
            } else {
                System.out.println("Special");
            }
        }

    }
}
