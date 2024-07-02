package bj_24_07_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String str1 = "";
        String str2 = "";

        if (len % 2 == 0) {
            str1 = str.substring(0, len / 2);
            str2 = str.substring(len / 2, len);
        } else {
            str1 = str.substring(0, len / 2);
            str2 = str.substring(len / 2 + 1, len);
        }

        System.out.println(str1);
        System.out.println(str2);

    }
}
