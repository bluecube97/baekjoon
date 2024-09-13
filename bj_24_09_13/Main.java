package bj_24_09_13;

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
        int C = Integer.parseInt(br.readLine());

        B = B + C;
        if (B >= 60) {
            A = A + B / 60;
            B = B % 60;
        }

        if (A >= 24) {
            A = A % 24;
        }

        System.out.println(A + " " + B);
    }
}
