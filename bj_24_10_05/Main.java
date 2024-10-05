package bj_24_10_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int pushCount = 0;

        for (int i = 0; i < N; i++) {
            int height = Integer.parseInt(st.nextToken());

            while (!stack.isEmpty() && stack.peek() < height) {
                stack.pop();
            }
            stack.push(height);
            if (stack.size() == 1) {
                pushCount++;
            }
        }

        System.out.println(pushCount);
    }
}
