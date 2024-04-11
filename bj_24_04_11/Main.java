package bj_24_04_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            map.put(br.readLine(), 1);
        }

        int cnt = 0;

        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            if (map.containsKey(input)) {
                map.put(input, 2);
                cnt++;
            }
        }

        sb.append(cnt).append("\n");
        List<String> outlist = new ArrayList<>();

        for (String key : map.keySet()) {
            if (map.get(key) == 2) {
                outlist.add(key);
            }
        }

        Collections.sort(outlist);

        for (String s : outlist) {
            sb.append(s).append("\n");
        }

        System.out.println(sb);
        br.close();

    }
}
