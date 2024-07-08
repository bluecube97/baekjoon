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

        for (int i = 0; i < arrSize; i += 2) {
            for (int j = i; j < arrSize - i; j++) {
                star[i][j] = true;
                star[arrSize - i - 1][j] = true;
                star[j][i] = true;
                star[j][arrSize - i - 1] = true;
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
