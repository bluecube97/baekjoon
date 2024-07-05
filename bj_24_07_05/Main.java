package bj_24_07_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int scenarioCnt = 0;

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int o = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            if (o == 0 && w == 0) {
                System.out.println(sb.toString());
                return;
            }

            scenarioCnt++;
            boolean isDead = false;

            while (true) {
                st = new StringTokenizer(br.readLine());
                String command = st.nextToken();
                int n = Integer.parseInt(st.nextToken());

                if (command.equals("#") && n == 0) {
                    break;
                }

                if (!isDead) {
                    if (command.equals("F")) {
                        w += n;
                    } else if (command.equals("E")) {
                        w -= n;
                    }

                    if (w <= 0) {
                        isDead = true;
                    }
                }
            }

            if (w <= 0) {
                sb.append(scenarioCnt).append(" RIP\n");
            } else if (w > o / 2 && w < o * 2) {
                sb.append(scenarioCnt).append(" :-)\n");
            } else {
                sb.append(scenarioCnt).append(" :-(\n");
            }
        }
    }
}

