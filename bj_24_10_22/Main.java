package bj_24_10_22;

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

        if (A + B == C) {
            System.out.println(A + "+" + B + "=" + C);
        } else if (A - B == C) {
            System.out.println(A + "-" + B + "=" + C);
        } else if (A * B == C) {
            System.out.println(A + "*" + B + "=" + C);
        } else if (A / B == C) {
            System.out.println(A + "/" + B + "=" + C);
        } else if (A == B + C) {
            System.out.println(A + "=" + B + "+" + C);
        } else if (A == B - C) {
            System.out.println(A + "=" + B + "-" + C);
        } else if (A == B * C) {
            System.out.println(A + "=" + B + "*" + C);
        } else if (A == B / C) {
            System.out.println(A + "=" + B + "/" + C);
        }
    }
}
