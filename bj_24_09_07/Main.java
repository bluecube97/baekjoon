package bj_24_09_07;

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

        int a1 = A / 4 + 1;
        int a2 = A % 4;
        if (a2 == 0) {
            a2 = 4;
            a1--;
        }

        int b1 = B / 4 + 1;
        int b2 = B % 4;
        if (b2 == 0) {
            b2 = 4;
            b1--;
        }

        System.out.println(Math.abs(a1 - b1) + Math.abs(a2 - b2));
    }
}
