package bj_24_09_27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int gifticon = Integer.parseInt(br.readLine());
        int useCnt = 0;

        for (int i = 0; i < gifticon; i++) {
            String input = br.readLine();
            int day = Integer.parseInt(input.substring(2));
            if (day <= 90) {
                useCnt++;
            }
        }

        System.out.println(useCnt);
    }
}
