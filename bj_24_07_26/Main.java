package bj_24_07_26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            if (N == 0) {
                return;
            }
            int P = Integer.parseInt(st.nextToken());

            List<List<Integer>> pageList = new ArrayList<>();

            for (int i = 1; i <= N / 2; i += 2) {
                List<Integer> page = new ArrayList<>();
                page.add(i);
                page.add(i + 1);
                page.add(N - i);
                page.add(N - (i - 1));
                pageList.add(page);
            }
            for (List<Integer> list : pageList) {
                if (list.contains(P)) {
                    list.remove((Integer) P);
                    for (int pageNum : list) {
                        System.out.print(pageNum + " ");
                    }
                    System.out.println();
                    break;
                }
            }
        }
    }
}
