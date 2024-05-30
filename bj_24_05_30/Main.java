package bj_24_05_30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int candidate = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> voteQueue = new PriorityQueue<>(Collections.reverseOrder());
        int dasom = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 1; i < candidate; i++) {
            voteQueue.add(Integer.parseInt(br.readLine()));
        }

        while (!voteQueue.isEmpty() && voteQueue.peek() >= dasom) {
            int top = voteQueue.poll();
            result++;
            dasom++;
            voteQueue.add(top - 1);
        }
        System.out.println(result);
    }
}
