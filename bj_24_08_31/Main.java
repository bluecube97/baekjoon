package bj_24_08_31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testcase; i++) {
            BigInteger input = new BigInteger(br.readLine());
            if (input.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}
