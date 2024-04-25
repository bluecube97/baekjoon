package bj_24_04_25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase; i++) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            String _input = br.readLine();
            String input = _input + _input;

            if (_input.length() % 2 == 0) {
                input = _input;
            }

            for (int j = 0; j < input.length(); j++) {
                sb.append(input.charAt(j));
                j++;
                sb2.append(input.charAt(j));
            }
            System.out.println(sb);
            System.out.println(sb2);
        }
    }
}
