package bj_24_03_11_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        int primeCount = countPrimes(numbers);
        System.out.println(primeCount);
    }

    public static int countPrimes(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}