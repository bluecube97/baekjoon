package bj_24_09_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int beforeScore = 0;
        int totalScore = 0;

        while (st.hasMoreTokens()) {
            int score = Integer.parseInt(st.nextToken());
            if (score == 1) {
                beforeScore++;
                totalScore += beforeScore;
            } else {
                beforeScore = 0;
            }
        }
        System.out.println(totalScore);
    }
}
