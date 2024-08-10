package bj_24_08_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String result = null;

        int len = str.length();

        for (int i = 1; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                String part1 = str.substring(0, i);
                String part2 = str.substring(i, j);
                String part3 = str.substring(j);

                String reversedPart1 = new StringBuilder(part1).reverse().toString();
                String reversedPart2 = new StringBuilder(part2).reverse().toString();
                String reversedPart3 = new StringBuilder(part3).reverse().toString();

                String combined = reversedPart1 + reversedPart2 + reversedPart3;

                if (result == null || combined.compareTo(result) < 0) {
                    result = combined;
                }
            }
        }

        System.out.println(result);
    }
}
