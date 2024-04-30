package bj_24_04_30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        for (int i = 0; i < 26; i++) {
            boolean b = false;
            for (int j = 0; j < S.length(); j++) {
                if (S.charAt(j) == i + 97) {
                    System.out.print(j + " ");
                    b = true;
                    break;
                }
            }
            if (!b) {
                System.out.print("-1" + " ");
            }
        }

    }
}
