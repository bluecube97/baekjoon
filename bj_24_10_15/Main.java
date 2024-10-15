package bj_24_10_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            br.readLine();
            int studentNum = Integer.parseInt(br.readLine());
            BigInteger candySum = new BigInteger("0");
            for (int j = 0; j < studentNum; j++) {
                BigInteger candy = new BigInteger(br.readLine());
                candySum = candySum.add(candy);
            }

            if (candySum.mod(new BigInteger(Integer.toString(studentNum))).equals(new BigInteger("0"))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
