package bj_24_06_28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String phoneA = br.readLine();
        String phoneB = br.readLine();
        String result = "";

        for (int i = 0; i < phoneA.length(); i++) {
            result += phoneA.charAt(i);
            result += phoneB.charAt(i);
        }

        while (result.length() > 2) {
            String tempResult = "";
            for (int i = 0; i < result.length() - 1; i++) {
                int num = Integer.parseInt(result.substring(i, i + 1)) + Integer.parseInt(result.substring(i + 1, i + 2));
                if (num >= 10) {
                    num -= 10;
                }
                tempResult += String.valueOf(num);
            }
            result = tempResult;
        }

        System.out.println(result);
    }
}
