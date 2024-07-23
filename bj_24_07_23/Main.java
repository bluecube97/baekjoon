package bj_24_07_23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int dalgu = 0;
        int fonix = 0;
        int match = Integer.parseInt(br.readLine());

        for (int i = 0; i < match; i++) {
            String winner = br.readLine();

            if (winner.equals("D")) {
                dalgu++;
            } else {
                fonix++;
            }

            if (Math.abs(dalgu - fonix) > 1) {
                System.out.println(dalgu + ":" + fonix);
                return;
            }
        }
        System.out.println(dalgu + ":" + fonix);
    }
}
