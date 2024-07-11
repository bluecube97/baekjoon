package bj_24_07_10_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int human = 0;

        for (int i = 0; i < N / C + 1; i++) {
            for (int j = 0; j < N / B + 1; j++) {
                for (int k = 0; k < N / A + 1; k++) {
                    human = k * A + j * B + i * C;
                    if (human == N) {
                        System.out.println(1);
                        return;
                    }
                }
            }
        }

        System.out.println(0);

    }
}
