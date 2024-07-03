package bj_24_07_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        String str = br.readLine();

        Map<Character, Integer> freq = new HashMap<>();

        if (len % 2 == 0) {
            for (int i = 0; i < len; i++) {
                char ch = str.charAt(i);
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            }
        } else {
            for (int i = 0; i < len; i++) {
                if (i == len / 2) continue;
                char ch = str.charAt(i);
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            }
        }

        int oddCount = 0;
        for (int count : freq.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

        if (oddCount > 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}