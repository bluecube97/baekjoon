package bj_24_10_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numList = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                numList.add(Integer.parseInt(st.nextToken()));
            }
        }

        int max = -1;
        int index = 0;
        int maxX = 0;
        int maxY = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int num = numList.get(index);
                if (num > max) {
                    max = num;
                    maxX = i + 1;
                    maxY = j + 1;
                }
                index++;
            }
        }

        System.out.println(max);
        System.out.println(maxX + " " + maxY);

    }
}
