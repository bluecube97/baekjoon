package bj_24_08_13_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());
        int needTime = Integer.parseInt(br.readLine());

        second += needTime;

        while (hour >= 24 || minute >= 60 || second >= 60) {
            if (second >= 60) {
                second -= 60;
                minute++;
            }
            if (minute >= 60) {
                minute -= 60;
                hour++;
            }
            if (hour >= 24) {
                hour -= 24;
            }
        }

        System.out.println(hour + " " + minute + " " + second);
    }
}
