package bj_24_06_13_1;

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
            int index = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            int S1 = 0;
            int S2 = 0;
            int S3 = 0;

            for (int j = 1; j <= num; j++) {
                S1 += j;
                S2 += 2 * j - 1;
                S3 += 2 * j;
            }
            System.out.println(index + " " + S1 + " " + S2 + " " + S3);
        }
    }
}
