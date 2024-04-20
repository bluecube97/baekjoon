package bj_24_04_20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int test_case = Integer.parseInt(br.readLine());
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < test_case; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input == 0) {
                if (list.isEmpty()) {
                    sb.append(0);
                    sb.append("\n");
                } else {
                    sb.append(list.getFirst());
                    sb.append("\n");
                    list.removeFirst();
                }
            } else {
                list.addLast(input);
                int idx = getIdx(list, input);
                list = min_hip_sort(list, idx, input);
            }
        }
    }

    private static LinkedList<Integer> min_hip_sort(LinkedList<Integer> list, int idx, int input) {
        int parent_idx = 0;
        if (idx % 2 == 0) {
            parent_idx = idx / 2 - 1;
        } else {
            parent_idx = idx / 2;
        }

        if (list.get(parent_idx) > input) {
            int temp = list.get(parent_idx);
            list.set(parent_idx, input);
            list.set(idx, temp);
            list = min_hip_sort(list, parent_idx, input);
        }

        return list;
    }

    private static int getIdx(LinkedList<Integer> list, int input) {
        int idx = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == input) {
                idx = i;
                break;
            }
        }

        return idx;
    }

}
