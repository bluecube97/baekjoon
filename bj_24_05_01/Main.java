package bj_24_05_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        if (minute - 45 < 0) {
            if (hour - 1 < 0) {
                hour = 23;
                minute += 15;
            } else {
                hour -= 1;
                minute += 15;
            }
        } else {
            minute -= 45;
        }

        System.out.println(hour + " " + minute);
    }
}
