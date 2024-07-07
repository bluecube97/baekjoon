package bj_24_07_07_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] sequence = generateSequence(N);

        for (int i = 0; i < N; i++) {
            System.out.print(sequence[i]);
            if (i < N - 1) {
                System.out.print(" ");
            }
        }
    }

    private static int[] generateSequence(int N) {
        int[] sequence = new int[N];

        for (int i = 0; i < N; i++) {
            sequence[i] = 2 * i + 1;
        }

        return sequence;
    }
}

