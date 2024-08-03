package bj_24_08_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int Y = 0;
        int M = 0;

        while (st.hasMoreTokens()) {
            int time = Integer.parseInt(st.nextToken());
            Y += (time / 30 + 1) * 10;
            M += (time / 60 + 1) * 15;
        }

        if (Y < M) {
            System.out.println("Y " + Y);
        } else if (Y > M) {
            System.out.println("M " + M);
        } else {
            System.out.println("Y M " + Y);
        }
    }
}
