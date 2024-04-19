package bj_24_04_19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test_case = sc.nextInt();

        for (int i = 0; i < test_case; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int result = a % 10;

            for (int j = 1; j < b; j++) {
                result = (result * a) % 10;
            }
            System.out.println(result != 0 ? result : 10);
        }
    }
}
