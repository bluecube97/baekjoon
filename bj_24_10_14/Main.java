package bj_24_10_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            int num = Integer.parseInt(br.readLine());
            int W = 0;
            for (int k = 1; k <= num; k++) {
                int T = (k + 1) * (k + 2) / 2;
                W += k * T;
            }
            System.out.println(W);
        }
    }
}
