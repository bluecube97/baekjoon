package bj_24_05_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testcase = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        List<Integer> numList = new ArrayList<>();

        for (int i = 0; i < testcase; i++) {
            list.add(Integer.parseInt(br.readLine()));
            numList.add(i + 1);
        }
        int j = 0;
        sb.append('+').append('\n');

        try {
            for (int i = 0; i < testcase; i++) {
                while (!numList.isEmpty()) {
                    if (list.get(i) != numList.get(j)) {
                        sb.append('+').append('\n');
                        j++;
                        continue;
                    } else {
                        sb.append('-').append('\n');
                        numList.remove(j);
                        j--;
                        break;
                    }
                }
            }
            System.out.println(sb);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("NO");
        }
    }
}
