package bj_24_06_26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testcase; i++) {
            String input = br.readLine();
            System.out.println(input.charAt(0) + "" + input.charAt(input.length() - 1));
        }
    }
}
