package bj_24_03_19_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        LinkedList<Integer> rotate_queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            rotate_queue.add(i + 1);
        }

        st = new StringTokenizer(br.readLine());
        int result = 0;

        for (int i = 0; i < M; i++) {
            int idx = Integer.parseInt(st.nextToken());

            while (true) {
                if (rotate_queue.getFirst() == idx) {
                    rotate_queue.removeFirst();
                    break;
                } else if (rotate_queue.indexOf(idx) > rotate_queue.size() / 2) {
                    rotate_queue.addFirst(rotate_queue.getLast());
                    for (int j = rotate_queue.size() - 1; j > 0; j--) {
                        rotate_queue.set(j, rotate_queue.get(j - 1));
                    }
                    rotate_queue.removeFirst();
                    result++;
                } else {
                    rotate_queue.addLast(rotate_queue.getFirst());
                    for (int j = 0; j < rotate_queue.size() - 1; j++) {
                        rotate_queue.set(j, rotate_queue.get(j + 1));
                    }
                    rotate_queue.removeLast();
                    result++;
                }
            }
        }
        System.out.println(result);

    }

}
