package bj_24_06_13_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = true;
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                int tempCompare = o1.getValue().compareTo(o2.getValue());
                if (tempCompare != 0) {
                    return tempCompare;
                } else {
                    return o1.getKey().compareTo(o2.getKey());
                }
            }
        });

        while (flag) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String city = st.nextToken();
            int temp = Integer.parseInt(st.nextToken());
            if (city.equals("Waterloo")) {
                flag = false;
            }
            Map<String, Integer> map = new HashMap<>();
            map.put(city, temp);
            pq.add(map.entrySet().iterator().next());
        }
        System.out.println(pq.poll().getKey());
    }
}