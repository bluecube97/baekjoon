package bj_24_07_29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testcase; i++) {
            String life = br.readLine();
            int score = 0;
            for (char c : life.toCharArray()) {
                if (c == ' ') {
                    continue;
                }
                score += c - 'A' + 1;
            }
            if (score == 100) {
                System.out.println("PERFECT LIFE");
            } else {
                System.out.println(score);
            }
        }
    }
}
