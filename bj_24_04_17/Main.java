package bj_24_04_17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());

        String str_N = Integer.toString(N);
        String str_N_ = str_N.substring(0, str_N.length() - 2) + "00";

        int N_ = Integer.parseInt(str_N_);

        while (N_ % F != 0) {
            N_++;
        }

        System.out.printf("%02d%n", N_ % 100);
    }
}
