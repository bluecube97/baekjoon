package bj_24_07_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testcase; i++) {
            int store = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] distance = new int[store];

            for (int j = 0; j < store; j++) {
                distance[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(distance);
            System.out.println((distance[store - 1] - distance[0]) * 2);
        }
    }
}
