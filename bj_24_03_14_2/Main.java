package bj_24_03_14_2;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num_cnt = sc.nextInt();
        int[] num_arr = new int[num_cnt];

        for (int i = 0; i < num_cnt; i++) {
            num_arr[i] = sc.nextInt();
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int i = 0; i < num_cnt; i++) {
            heap.add(num_arr[i]);
        }

        for (int i = 0; i < num_cnt; i++) {
            num_arr[i] = heap.poll();
        }

        for (int i = 0; i < num_cnt; i++) {
            System.out.println(num_arr[i]);
        }
    }
}
