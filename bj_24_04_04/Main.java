package bj_24_04_04;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int testCase = sc.nextInt();
        LinkedList<Integer> stack = new LinkedList<>();

        for (int i = 0; i < testCase; i++) {
            String order = sc.next();

            switch (order) {
                case "push":
                    int x = sc.nextInt();
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