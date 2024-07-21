package bj_24_07_21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int testcase = Integer.parseInt(br.readLine());
            if (testcase == 0) {
                return;
            }

            PriorityQueue<String[]> StrList = new PriorityQueue<>(Comparator.comparing(a -> a[1]));

            for (int i = 0; i < testcase; i++) {
                String str = br.readLine();
                StrList.add(new String[]{str, str.toLowerCase()});
            }

            System.out.println(Objects.requireNonNull(StrList.poll())[0]);
        }
    }
}