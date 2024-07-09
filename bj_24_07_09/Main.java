package bj_24_07_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<Set<Integer>> switchLamps = new ArrayList<>(); // 각 스위치가 어떤 램프에 연결되어 있는지 저장하는 리스트
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int switchNum = Integer.parseInt(st.nextToken());
            Set<Integer> lamps = new HashSet<>();
            for (int j = 0; j < switchNum; j++) {
                lamps.add(Integer.parseInt(st.nextToken()));
            }
            switchLamps.add(lamps);
        }

        for (int i = 0; i < N; i++) {
            Set<Integer> lamps = new HashSet<>();
            for (int j = 0; j < N; j++) {
                if (i != j) {
                    lamps.addAll(switchLamps.get(j));
                }
            }
            if (lamps.size() == M) {
                System.out.println(1);
                return;
            }
        }

        System.out.println(0);
    }
}
