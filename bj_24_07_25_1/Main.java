package bj_24_07_25_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());

        // nC3 == n! / (n-3)! * 3! == n * (n-1) * (n-2) / 3!
        System.out.println((n * (n - 1) * (n - 2)) / 6);
        System.out.println(3);
    }
}