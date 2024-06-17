package bj_24_06_17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int p = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int lcm = p * q / gcd(p, q);

        if (lcm <= s) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}