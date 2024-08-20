package bj_24_08_20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            int sum = a + b + c + d;

            if (sum == 0) {
                System.out.println("D");
            } else if (sum == 1) {
                System.out.println("C");
            } else if (sum == 2) {
                System.out.println("B");
            } else if (sum == 3) {
                System.out.println("A");
            } else if (sum == 4) {
                System.out.println("E");
            }
        }
    }
}
