package bj_24_06_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testcase; i++) {
            int cnt = Integer.parseInt(br.readLine());
            int p1Cnt = 0;
            int p2Cnt = 0;
            for (int j = 0; j < cnt; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String p1 = st.nextToken();
                String p2 = st.nextToken();

                if (p1.equals("R") && p2.equals("S")) {
                    p1Cnt++;
                } else if (p1.equals("S") && p2.equals("P")) {
                    p1Cnt++;
                } else if (p1.equals("P") && p2.equals("R")) {
                    p1Cnt++;
                } else if (p1.equals("S") && p2.equals("R")) {
                    p2Cnt++;
                } else if (p1.equals("P") && p2.equals("S")) {
                    p2Cnt++;
                } else if (p1.equals("R") && p2.equals("P")) {
                    p2Cnt++;
                }
            }
            if (p1Cnt > p2Cnt) {
                System.out.println("Player 1");
            } else if (p1Cnt < p2Cnt) {
                System.out.println("Player 2");
            } else {
                System.out.println("TIE");
            }
        }

    }
}
