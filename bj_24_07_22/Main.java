package bj_24_07_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int money = 0;
        while (true) {
            int betting = Integer.parseInt(br.readLine());
            if (betting == -1) {
                System.out.println(money);
                return;
            }
            money += betting;
        }
    }
}
