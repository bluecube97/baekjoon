package bj_24_06_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        PriorityQueue<Long> pq = new PriorityQueue<>();
        long totalLength = 0;
        for (int i = 0; i < n; i++) {
            long length = Long.parseLong(st.nextToken());
            pq.add(length);
            totalLength += length;
        }

        long result = 0;
        while (pq.size() > 1) {
            long a = pq.poll();
            totalLength -= a;
            result += a * totalLength;
        }

        System.out.println(result);
    }
}
