package bj_24_06_24;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<Point> P = new ArrayList<>();
        List<Point> Q = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            P.add(new Point(x, y));
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            Q.add(new Point(x, y));
        }

        BigInteger maxLen = BigInteger.ZERO;
        for (Point p : P) {
            for (Point q : Q) {
                BigInteger dx = BigInteger.valueOf(p.x - q.x);
                BigInteger dy = BigInteger.valueOf(p.y - q.y);
                BigInteger len = dx.multiply(dx).add(dy.multiply(dy));
                maxLen = maxLen.max(len);
            }
        }
        System.out.println(maxLen);
    }
}
