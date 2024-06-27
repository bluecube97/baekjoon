package bj_24_06_27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int studentCnt = Integer.parseInt(br.readLine());
        int[] scoreArr = new int[studentCnt];
        int[] naScoreArr = new int[studentCnt];

        for (int i = 0; i < studentCnt; i++) {
            String stringScore = br.readLine();
            naScoreArr[i] = Integer.parseInt(stringScore);
            stringScore = stringScore.replace('0', '9').replace('6', '9');

            int score = Integer.parseInt(stringScore);
            if (score > 100) {
                score = 100;
            }
            scoreArr[i] = score;
        }

        int sum = Arrays.stream(scoreArr).sum();
        System.out.println(Math.round((double) sum / studentCnt));

    }
}
