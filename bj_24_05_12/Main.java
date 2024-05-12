package bj_24_05_12;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testcase = Integer.parseInt(br.readLine());
        int[] cnt = new int[10001];

        for (int i = 0; i < testcase; i++) {
            cnt[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 0; i <= 10000; i++) {
            while (cnt[i]-- > 0) {
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }
}
