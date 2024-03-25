package bj_24_03_25;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        String input = sc.next();

        BigInteger result = BigInteger.valueOf(0);

        for (int i = 0; i < length; i++) {
            char inputChar = input.charAt(i);
            BigInteger charVal = BigInteger.valueOf(inputChar - 'a' + 1);
            BigInteger powVal = BigInteger.valueOf(31).pow(i);
            BigInteger termVal = charVal.multiply(powVal);
            result = result.add(termVal);
        }

        BigInteger modVal = BigInteger.valueOf(1234567891);
        BigInteger resultVal = result.mod(modVal);

        System.out.println(resultVal);

    }
}
