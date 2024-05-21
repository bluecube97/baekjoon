package bj_24_05_21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int potionCnt = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double brokenShield = 0;

        for (int i = 0; i < potionCnt; i++) {
            int potion = Integer.parseInt(st.nextToken());
            brokenShield = 1 - (1 - brokenShield) * (1 - (double) potion / 100);
            System.out.printf("%.6f\n", brokenShield * 100);
        }
    }
}
