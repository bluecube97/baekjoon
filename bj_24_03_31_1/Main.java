package bj_24_03_31_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        int resultGCD = gcd(num1, num2);
        int resultLCM = lcm(num1, num2, resultGCD);

        System.out.println(resultGCD);
        System.out.println(resultLCM);

    }

    private static int lcm(int num1, int num2, int r) {
        return num1 * num2 / r;
    }

    private static int gcd(int num1, int num2) {
        while (num2 != 0){
            int r = num1 % num2;
            num1 = num2;
            num2 = r;
        }
        return num1;
    }
}
