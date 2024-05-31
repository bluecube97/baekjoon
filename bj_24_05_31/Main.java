package bj_24_05_31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int pointCnt = Integer.parseInt(br.readLine());

        int[][] pointGraphArr = new int[pointCnt][pointCnt];

        for (int i = 0; i < pointCnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < pointCnt; j++) {
                pointGraphArr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int k = 0; k < pointCnt; k++) {
            for (int i = 0; i < pointCnt; i++) {
                for (int j = 0; j < pointCnt; j++) {
                    if (pointGraphArr[i][k] == 1 && pointGraphArr[k][j] == 1) {
                        pointGraphArr[i][j] = 1;
                    }
                }
            }
        }

        for (int i = 0; i < pointCnt; i++) {
            for (int j = 0; j < pointCnt; j++) {
                System.out.print(pointGraphArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
