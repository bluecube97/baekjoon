package bj_24_04_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;

        int testCase = Integer.parseInt(br.readLine());
        LinkedList<Integer> stack = new LinkedList<>();

        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {
                case "push":
                    int x = Integer.parseInt(st.nextToken());
                    stack.add(x);
                    break;
                case "pop":
                    if (stack.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(stack.getLast()).append("\n");
                        stack.removeLast();
                    }
                    break;
                case "size":
                    sb.append(stack.size()).append("\n");
                    break;
                case "empty":
                    if (stack.isEmpty()) {
                        sb.append(1).append("\n");
                    } else sb.append(0).append("\n");
                    break;
                case "top":
                    if (stack.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(stack.getLast()).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);

    }
}