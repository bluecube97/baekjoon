package bj_24_04_03;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 1; i < input + 1; i++) {
            deque.add(i);
        }

        boolean removeFlag = true;

        while (deque.size() > 1){
            if (removeFlag){
                deque.removeFirst();
                removeFlag = false;
            }else {
                deque.add(deque.pollFirst());
                removeFlag = true;
            }
        }

        System.out.println(deque.getFirst());

    }
}
