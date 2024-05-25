package bj_24_05_25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int success = 0;

        int charCnt = Integer.parseInt(br.readLine());
        for (int i = 0; i < charCnt; i++) {
            String input = br.readLine();
            if (input.length() % 2 == 1) {
                continue;
            }

            Stack<Character> stack = new Stack<>();

            for (int j = 0; j < input.length(); j++) {
                if (stack.isEmpty()) {
                    stack.push(input.charAt(j));
                } else if (stack.peek().equals(input.charAt(j))) {
                    stack.pop();
                } else {
                    stack.push(input.charAt(j));
                }
            }
            if (stack.isEmpty()) {
                success++;
            }
        }

        System.out.println(success);
    }
}
