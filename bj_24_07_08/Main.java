package bj_24_07_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arrSize = 4 * (N - 1) + 1;
        boolean[][] star = new boolean[arrSize][arrSize];

        for (int i = 0; i < arrSize; i++) {
            for (int j = 1; j < arrSize - j; j += 2) {
                star[j][i] = true;
                star[arrSize - j][i] = true;
                star[i][j] = true;
                star[i][arrSize - j] = true;
            }
        }

        for (int i = 0; i < arrSize; i++) {
            for (int j = 0; j < arrSize; j++) {
                System.out.print(star[i][j] ? "*" : " ");
            }
            System.out.println();
        }

    }
}
