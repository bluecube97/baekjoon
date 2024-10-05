package bj_24_10_05_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int dot = 0;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                dot += j;
            }

            dot += i * (i + 1);
        }

        System.out.println(dot);
    }
}
