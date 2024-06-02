package bj_24_06_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        HashMap<String, Integer> human = new HashMap<>();

        for (int i = 0; i < testcase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            human.put(st.nextToken(), Integer.parseInt(st.nextToken()));
        }

        Map.Entry<String, Integer> maxEntry = null;
        for (Map.Entry<String, Integer> entry : human.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            } else if (entry.getValue().equals(maxEntry.getValue()) && entry.getKey().compareTo(maxEntry.getKey()) < 0) {
                maxEntry = entry;
            }
        }

        System.out.println(maxEntry.getKey());
    }
}
