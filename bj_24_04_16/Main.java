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

        int max = Collections.max(tree_list);

        for (int i = max; i >= 0 ; i--) {
            int need_len = 0;
            for (int j = 0; j < tree_cnt; j++) {
                int dist = tree_list.get(j) - i;
                if (dist > 0) {
                    need_len += dist;
                }
            }
            if (need_len >= tree_len) {
                System.out.println(i);
                break;
            }
        }
    }
}
