package bj_24_07_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        int E = Integer.parseInt(br.readLine());
        int sec = 0;

        while (A != B) {
            if (A < 0) {
                A++;
                sec += C;
            } else if (A == 0) {
                A++;
                sec += D + E;
            } else {
                A++;
                sec += E;
            }
        }
        System.out.println(sec);
    }
}
