package bj_24_10_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String N = br.readLine();
            if (N.equals("0")) break;
            while (N.length() != 1) {
                int sum = 0;
                for (int i = 0; i < N.length(); i++) {
                    sum += N.charAt(i) - '0';
                }
                N = Integer.toString(sum);
            }
            System.out.println(N);
        }
    }
}
