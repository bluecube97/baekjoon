package bj_24_06_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Object> personInfo = new HashMap<>();

        PriorityQueue<Map<String, Object>> pq1 = new PriorityQueue<>(new Comparator<Map<String, Object>>() {
            @Override
            public int compare(Map<String, Object> o1, Map<String, Object> o2) {
                return Integer.parseInt((String) o1.get("year")) % 100 - Integer.parseInt((String) o2.get("year")) % 100;
            }
        });

        PriorityQueue<Map<String, Object>> pq2 = new PriorityQueue<>(new Comparator<Map<String, Object>>() {
            @Override
            public int compare(Map<String, Object> o1, Map<String, Object> o2) {
                return Integer.parseInt((String) o2.get("score")) - Integer.parseInt((String) o1.get("score"));
            }
        });

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            personInfo.put("score", st.nextToken());
            personInfo.put("year", st.nextToken());
            personInfo.put("name", st.nextToken());
            pq1.add(new HashMap<>(personInfo));
            pq2.add(new HashMap<>(personInfo));
        }

        for (int i = 0; i < 3; i++) {
            System.out.print(((String) pq1.poll().get("year")).substring(2, 4));
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print(((String) pq2.poll().get("name")).charAt(0));
        }
    }
}
