package bj_24_10_21;

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
        int temp;
        int cnt = 0;

        while (A + 2 != B + 1 || B + 1 != C) {
            if ((B - A) > (C - B)) {
                C = A + 1;
                temp = C;
                C = B;
                B = temp;
            } else {
                A = C - 1;
                temp = A;
                A = B;
                B = temp;
            }
            cnt++;
        }

        System.out.println(cnt);
    }
}
