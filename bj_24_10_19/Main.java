package bj_24_10_19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        boolean isHappy = true;

        int[][] charm = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                charm[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            if (charm[i][a - 1] > charm[a - 1][b - 1]) {
                isHappy = false;
                break;
            }
        }

        for (int i = 0; i < N; i++) {
            if (charm[b - 1][i] > charm[a - 1][b - 1]) {
                isHappy = false;
                break;
            }
        }

        if (isHappy) {
            System.out.println("HAPPY");
        } else {
            System.out.println("ANGRY");
        }
    }
}
