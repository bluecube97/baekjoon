package bj_24_08_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            int testcase = Integer.parseInt(br.readLine());
            BigInteger sum = new BigInteger("0");
            for (int j = 0; j < testcase; j++) {
                long n = Long.parseLong(br.readLine());
                sum = sum.add(BigInteger.valueOf(n));
            }
            if (sum.compareTo(BigInteger.ZERO) > 0) {
                System.out.println("+");
            } else if (sum.compareTo(BigInteger.ZERO) < 0) {
                System.out.println("-");
            } else {
                System.out.println("0");
            }
        }
    }
}
