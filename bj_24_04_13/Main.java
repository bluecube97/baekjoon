package bj_24_04_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int stair_cnt = Integer.parseInt(br.readLine());
        int[] stair = new int[stair_cnt+1];
        int[] dp = new int[stair_cnt+1];

        for (int i = 1; i <= stair_cnt; i++) {
            stair[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = stair[1];

        if (stair_cnt >= 2) {
            dp[2] = stair[1] + stair[2];
        }

        for (int i = 3; i <= stair_cnt; i++) {
            dp[i] = Math.max(dp[i - 2] + stair[i], dp[i - 3] + stair[i - 1] + stair[i]);
        }

        System.out.println(dp[stair_cnt]);
    }
}