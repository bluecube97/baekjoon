package bj_24_07_04;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        BigInteger result = BigInteger.valueOf(5);

        for (int i = 2; i <= input; i++) {
            result = result.add(BigInteger.valueOf(3L * i + 1));
        }

        System.out.println(result.mod(BigInteger.valueOf(45678)));
    }
}
