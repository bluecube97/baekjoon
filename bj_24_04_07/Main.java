package bj_24_04_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().toUpperCase();

        int[] freq = new int[26];
        int max = -1;
        char result = '?';

        for (int i = 0; i < input.length(); i++) {
            int index = input.charAt(i) - 'A';
            freq[index]++;

            if (freq[index] > max) {
                max = freq[index];
                result = input.charAt(i);
            } else if (freq[index] == max) {
                result = '?';
            }
        }

        System.out.println(result);
    }
}