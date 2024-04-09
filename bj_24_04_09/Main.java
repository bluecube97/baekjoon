package bj_24_04_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int poke_cnt = Integer.parseInt(st.nextToken());
        int test_case = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> poke_map1 = new HashMap<>();
        HashMap<Integer, String> poke_map2 = new HashMap<>();
        for (int i = 0; i < poke_cnt; i++) {
            String input = br.readLine();
            poke_map1.put(input, i + 1);
            poke_map2.put(i + 1, input);
        }

        for (int i = 0; i < test_case; i++) {
            String test = br.readLine();
            if (test.charAt(0) >= 'A' && test.charAt(0) <= 'z') {
                sb.append(poke_map1.get(test)).append("\n");
            } else {
                sb.append(poke_map2.get(Integer.parseInt(test))).append("\n");
            }
        }
        System.out.println(sb);
    }
}
