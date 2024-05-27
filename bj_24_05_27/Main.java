package bj_24_05_27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int stampCnt = Integer.parseInt(br.readLine());
        int price = Integer.parseInt(br.readLine());

        int pay = price;

        if (stampCnt >= 5) {
            pay = Math.min(pay, Math.max(price - 500, 0));
        }
        if (stampCnt >= 10) {
            pay = Math.min(pay, Math.max((int) (price * 0.9), 0));
        }
        if (stampCnt >= 15) {
            pay = Math.min(pay, Math.max(price - 2000, 0));
        }
        if (stampCnt >= 20) {
            pay = Math.min(pay, Math.max((int) (price * 0.75), 0));
        }

        System.out.println(pay);
    }
}