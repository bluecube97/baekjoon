package bj_24_04_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        int[] x = new int[testCase];
        String[] order = new String[testCase];
        List<Integer> stack = new ArrayList<>();

        for (int i = 0; i < testCase; i++) {
            order[i] = sc.next();
            if (order[i].startsWith("push")) {
                x[i] = sc.nextInt();
            }
        }

        for (int i = 0; i < testCase; i++) {
            switch (order[i]) {
                case "push":
                    stack.add(x[i]);
                    break;
                case "pop":
                    if (stack.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack.get(stack.size() - 1));
                        stack.remove(stack.size() - 1);
                    }
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    if (stack.isEmpty()) {
                        System.out.println(1);
                    } else System.out.println(0);
                    break;
                case "top":
                    if (stack.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack.get(stack.size() - 1));
                    }
                    break;
            }
        }
    }
}
