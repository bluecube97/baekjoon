package bj_24_07_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int o = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        boolean playFlag = true;
        int statusCnt = 0;

        while (playFlag) {
            if (w < 0) {
                System.out.println("RIP");
                return;
            }
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int N = Integer.parseInt(st.nextToken());

            switch (command) {
                case "F":
                    w += N;
                    break;
                case "E":
                    w -= N;
                    break;
                case "#":
                    statusCnt++;
                    if (w > o * 0.5 && w < o * 2) {
                        System.out.println(statusCnt + " :-)");
                    } else {
                        System.out.println(statusCnt + " :-(");
                    }
            }
        }
    }
}
