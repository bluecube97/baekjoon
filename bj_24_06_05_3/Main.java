package bj_24_06_05_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < testcase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] startPoint = new int[3];
            int[] endPoint = new int[3];

            for (int j = 0; j < 3; j++) {
                startPoint[j] = Integer.parseInt(st.nextToken());
            }
            for (int j = 0; j < 3; j++) {
                endPoint[j] = Integer.parseInt(st.nextToken());
            }

            System.out.println(startPoint[2] + Math.abs(endPoint[0] - startPoint[0]) + Math.abs(endPoint[1] - startPoint[1]) + endPoint[2]);
        }
    }
}
