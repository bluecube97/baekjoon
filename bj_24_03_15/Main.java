package bj_24_03_15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int result = pactorial(N) / (pactorial(N - K) * pactorial(K));
        System.out.println(result);

    }

//    public static int pactorial(int n) {
//        if (n == 1) return 1;
//
//        return n * pactorial(n - 1);
//    }

    public static int pactorial(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
