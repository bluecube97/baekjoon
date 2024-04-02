package bj_24_04_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());
        String[] PS = new String[testCase];

        for (int i = 0; i < testCase; i++) {
            PS[i] = br.readLine();
        }

        for (int i = 0; i < testCase; i++) {
            int cnt = 0;
            for (int j = 0; j < PS[i].length(); j++) {
                if (PS[i].charAt(j) == '(') {
                    cnt++;
                } else if (PS[i].charAt(j) == ')') {
                    cnt--;
                }
                if (cnt < 0) {
                    System.out.println("NO");
                    break;
                }
            }
            if (cnt > 0) {
                System.out.println("NO");
            } else if (cnt == 0){
                System.out.println("YES");
            }
        }
    }
}