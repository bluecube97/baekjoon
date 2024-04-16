package bj_24_04_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int tree_cnt = Integer.parseInt(st.nextToken());
        int tree_len = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        List<Integer> tree_list = new ArrayList<>();
        for (int i = 0; i < tree_cnt; i++) {
            tree_list.add(Integer.parseInt(st.nextToken()));
        }

        int start = 0;
        int end = Collections.max(tree_list);

        while (start <= end) {
            int mid = (start + end) / 2;
            long sum = 0;

            for (int tree : tree_list) {
                if (tree > mid) {
                    sum += tree - mid;
                }
            }

            if (sum >= tree_len) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(end);
    }
}
