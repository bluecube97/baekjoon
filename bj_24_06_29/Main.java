package bj_24_06_29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        int[] x = new int[testcase];
        int[] y = new int[testcase];

        for (int i = 0; i < testcase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        double minRSS = Double.MAX_VALUE;
        int minA = -1;
        int minB = -1;

        for (int a = 1; a <= 100; a++) {
            for (int b = 1; b <= 100; b++) {
                double RSS = 0;
                for (int i = 0; i < testcase; i++) {
                    double fx = a * x[i] + b;
                    RSS += Math.pow(y[i] - fx, 2);
                }
                if (RSS < minRSS) {
                    minRSS = RSS;
                    minA = a;
                    minB = b;
                }
            }
        }

        System.out.println(minA + " " + minB);
    }
}
