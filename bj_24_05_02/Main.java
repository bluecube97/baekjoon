package bj_24_05_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int week = Integer.parseInt(br.readLine());
        List<HashMap<String, Object>> soldier = new ArrayList<>();

        for (int i = 0; i < week; i++) {
            for (int j = 0; j < 4; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                while (st.hasMoreTokens()) {
                    String name = st.nextToken();
                    if (!name.equals("-")) {
                        int time = 0;
                        boolean isSoldierInput = false;
                        switch (j) {
                            case 0:
                                time = 4;
                                break;
                            case 1:
                                time = 6;
                                break;
                            case 2:
                                time = 4;
                                break;
                            case 3:
                                time = 10;
                                break;
                        }
                        HashMap<String, Object> map = new HashMap<>();

                        // 같은 이름이 있는 경우
                        for (HashMap<String, Object> s : soldier) {
                            if (s.get("name").equals(name)) {
                                s.put("time", (int) s.get("time") + time);
                                isSoldierInput = true;
                                break;
                            }
                        }
                        if (!isSoldierInput) {
                            map.put("name", name);
                            map.put("time", time);
                            soldier.add(map);
                        }
                    }
                }
            }
        }

        if (soldier.isEmpty()) {
            System.out.println("Yes");
            return;
        }

        List<Integer> time = new ArrayList<>();

        for (
                HashMap<String, Object> s : soldier) {
            time.add((int) s.get("time"));
        }

        if (Collections.max(time) - Collections.min(time) <= 12) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
