package bj_24_06_18_1;

import java.util.Scanner;

public class Main {
    static int[][][][] parking = new int[16][16][16][16];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        parking[1][0][0][0] = 1;
        parking[0][1][0][0] = 1;
        parking[0][0][1][0] = 1;
        parking[0][0][0][1] = 1;

        for (int a = 0; a <= A; a++) {
            for (int b = 0; b <= B; b++) {
                for (int c = 0; c <= C; c++) {
                    for (int d = 0; d <= N - a - b - c; d++) {
                        if (a > 0) parking[a][b][c][d] += parking[a - 1][b][c][d];
                        if (b > 0) parking[a][b][c][d] += parking[a][b - 1][c][d];
                        if (c > 0) parking[a][b][c][d] += parking[a][b][c - 1][d];
                        if (d > 0) parking[a][b][c][d] += parking[a][b][c][d - 1];
                    }
                }
            }
        }

        System.out.println(parking[A][B][C][N - A - B - C]);
    }
}
