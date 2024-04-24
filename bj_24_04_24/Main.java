package bj_24_04_24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] pwArr = new String[N];
        for (int i = 0; i < N; i++) {
            pwArr[i] = br.readLine();
        }

        for (int i = 0; i < N; i++) {
            StringBuffer sb = new StringBuffer(pwArr[i]);
            String pw = sb.reverse().toString();
            for (int j = i; j < N; j++) {
                if (pw.equals(pwArr[j])) {
                    System.out.print(pw.length() + " ");
                    System.out.println(pw.charAt(pw.length() / 2));
                    break;
                }
            }
        }
    }
}
