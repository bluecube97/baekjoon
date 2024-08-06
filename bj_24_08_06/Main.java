package bj_24_08_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int input = Integer.parseInt(br.readLine());
            if (input == 0) {
                break;
            }

            String str = String.valueOf(input);
            char[] arr = str.toCharArray();
            int len = 1;

            for (char c: arr) {
                if (c == '1') {
                    len += 3;
                } else if (c == '0') {
                    len += 5;
                } else {
                    len += 4;
                }
            }

            System.out.println(len);
        }
    }
}
