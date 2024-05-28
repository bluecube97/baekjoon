package bj_24_05_28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testcase; i++) {
            int clothCnt = Integer.parseInt(br.readLine());
            HashMap<String, Integer> clothMap = new HashMap<>();

            for (int j = 0; j < clothCnt; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String cloth = st.nextToken();
                String type = st.nextToken();
                clothMap.put(type, clothMap.getOrDefault(type, 0) + 1);
            }

            int result = 1;
            for (int val : clothMap.values()) {
                result *= (val + 1);
            }
            System.out.println(result - 1);
        }
    }
}
