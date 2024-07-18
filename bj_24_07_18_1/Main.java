package bj_24_07_18_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static class Date{
        private final int year;
        private final int month;
        private final int day;

        public Date(String date) {
            this.year = Integer.parseInt(date.substring(0, 4));
            this.month = Integer.parseInt(date.substring(5, 7));
            this.day = Integer.parseInt(date.substring(8, 10));
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Date now = new Date(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int usable = 0;
        int nowDate = calcDate(now);

        for (int i = 0; i < N; i++) {
            Date gift = new Date(br.readLine());
            int giftDate = calcDate(gift);
            if (nowDate <= giftDate) usable++;
        }

        System.out.println(usable);
    }

    private static int calcDate(Date date) {
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int totalDays = date.year * 365 + date.day;

        for (int i = 0; i < date.month - 1; i++) {
            totalDays += daysInMonth[i];
        }

        return totalDays;
    }
}
