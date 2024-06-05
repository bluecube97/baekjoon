package bj_24_06_05_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int pointCnt = Integer.parseInt(st.nextToken());
        int xLen = N;
        int yLen = N;
        for (int i = 0; i < pointCnt; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (x >= xLen || y >= yLen) {
                continue;
            }

            if ((xLen - x) * (yLen) <= (yLen - y) * (xLen)) {
                xLen = x;
            } else {
                yLen = y;
            }
        }
        System.out.println(xLen * yLen);
    }
}
