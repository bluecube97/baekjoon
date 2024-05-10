package bj_24_05_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int lanCnt = Integer.parseInt(st.nextToken());
        int needLanCnt = Integer.parseInt(st.nextToken());

        List<Long> lanLength = new ArrayList<>();
        long max = 0;
        for (int i = 0; i < lanCnt; i++) {
            long length = Long.parseLong(br.readLine());
            lanLength.add(length);
            max = Math.max(max, length);
        }

        long start = 1;
        long end = max;

        while (start <= end) {
            long mid = (start + end) / 2;
            long cnt = 0;

            for (Long length : lanLength) {
                cnt += length / mid;
            }

            if (cnt >= needLanCnt) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(end);
    }
}
