package bj_24_06_25_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int questionCnt = Integer.parseInt(br.readLine());
        int[] levelArr = new int[questionCnt];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < questionCnt; i++) {
            levelArr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(levelArr);

        int maxDif = 0;
        int result = -1;

        for (int i = 0; i < questionCnt - 1; i++) {
            int dif = levelArr[i + 1] - levelArr[i];
            int candidate = levelArr[i] + dif / 2;
            if (candidate > levelArr[i] && candidate < levelArr[i + 1]) {
                int minDif = Math.min(candidate - levelArr[i], levelArr[i + 1] - candidate);

                if (minDif > maxDif) {
                    maxDif = minDif;
                    result = candidate;
                }
            }
        }

        System.out.println(result);
    }
}
