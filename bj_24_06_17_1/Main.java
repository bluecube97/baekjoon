package bj_24_06_17_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] sunflower = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                sunflower[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        while (!isSorted(sunflower)) {
            sunflower = rotate(sunflower, N);
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(sunflower[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] rotate(int[][] sunflower, int N) {
        int[][] resultSunflower = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                resultSunflower[j][N - 1 - i] = sunflower[i][j];
            }
        }
        return resultSunflower;
    }

    private static boolean isSorted(int[][] sunflower) {
        for (int i = 0; i < sunflower.length; i++) {
            for (int j = 0; j < sunflower[i].length - 1; j++) {
                if (sunflower[i][j] > sunflower[i][j + 1]) {
                    return false;
                }
            }
        }

        for (int j = 0; j < sunflower[0].length; j++) {
            for (int i = 0; i < sunflower.length - 1; i++) {
                if (sunflower[i][j] > sunflower[i + 1][j]) {
                    return false;
                }
            }
        }

        return true;
    }
}