package bj_24_06_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Boolean> ino = new HashMap<>(); // Input and Output

        int inoCnt = Integer.parseInt(br.readLine());
        for (int i = 0; i < inoCnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String eol = st.nextToken(); // Enter or Leave

            if (eol.equals("enter")) {
                ino.put(name, true);
            } else if (eol.equals("leave")) {
                ino.put(name, false);
            }
        }

        PriorityQueue<String> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (String name : ino.keySet()) {
            if (ino.get(name)) {
                pq.add(name);
            }
        }

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
