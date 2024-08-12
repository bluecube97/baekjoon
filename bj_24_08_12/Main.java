package bj_24_08_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] dimensions = br.readLine().split(" ");
        int N = Integer.parseInt(dimensions[0]);
        int M = Integer.parseInt(dimensions[1]);

        boolean[] rowHasGuard = new boolean[N];
        boolean[] colHasGuard = new boolean[M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                if (line.charAt(j) == 'X') {
                    rowHasGuard[i] = true;
                    colHasGuard[j] = true;
                }
            }
        }

        int rowsWithoutGuard = 0;
        int colsWithoutGuard = 0;

        for (int i = 0; i < N; i++) {
            if (!rowHasGuard[i]) {
                rowsWithoutGuard++;
            }
        }

        for (int j = 0; j < M; j++) {
            if (!colHasGuard[j]) {
                colsWithoutGuard++;
            }
        }

        System.out.println(Math.max(rowsWithoutGuard, colsWithoutGuard));
    }
}