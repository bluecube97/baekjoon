package bj_24_06_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());

        for (int k = 0; k < testcase; k++) {
            br.readLine();
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            char[][] candy = new char[r][c];

            for (int i = 0; i < r; i++) {
                String containCandy = br.readLine();
                for (int j = 0; j < c; j++) {
                    candy[i][j] = containCandy.charAt(j);
                }
            }

            int candyCnt = 0;

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (j - 2 >= 0 && candy[i][j] == 60 && candy[i][j - 1] == 111 && candy[i][j - 2] == 62) {
                        candyCnt++;
                        candy[i][j] = 46;
                        candy[i][j - 1] = 46;
                        candy[i][j - 2] = 46;
                    } else if (j + 2 < c && candy[i][j] == 62 && candy[i][j + 1] == 111 && candy[i][j + 2] == 60) {
                        candyCnt++;
                        candy[i][j] = 46;
                        candy[i][j + 1] = 46;
                        candy[i][j + 2] = 46;
                    } else if (i + 2 < r && candy[i][j] == 118 && candy[i + 1][j] == 111 && candy[i + 2][j] == 94) {
                        candyCnt++;
                        candy[i][j] = 46;
                        candy[i + 1][j] = 46;
                        candy[i + 2][j] = 46;
                    } else if (i - 2 >= 0 && candy[i][j] == 94 && candy[i - 1][j] == 111 && candy[i - 2][j] == 118) {
                        candyCnt++;
                        candy[i][j] = 46;
                        candy[i - 1][j] = 46;
                        candy[i - 2][j] = 46;
                    }
                }
            }
            System.out.println(candyCnt);
        }
    }
}
