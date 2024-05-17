package bj_24_05_17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int cnt = input / 5;
        int weight = cnt * 5;

        while (cnt >= 0) {
            if ((input - weight) % 3 == 0) {
                System.out.println(cnt + (input - weight) / 3);
                return;
            }
            cnt--;
            weight -= 5;
        }
        System.out.println(-1);
    }
}
