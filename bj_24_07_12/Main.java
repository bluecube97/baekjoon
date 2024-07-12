package bj_24_07_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static class Day {
        int year;
        int month;
        int day;

        public Day(int year, int month, int day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Day S = new Day(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        st = new StringTokenizer(br.readLine());
        Day E = new Day(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

        int totalDays = calcTotalDays(S, E);
        int totalMonths = totalDays / 30;
        int totalYears = totalMonths / 12;

        int annualLeave = calcAnnualLeave(totalYears); // 연차
        int monthlyLeave = calcMonthlyLeave(totalMonths); // 월차

        System.out.println(annualLeave + " " + monthlyLeave);
        System.out.println(totalDays + "days");
    }

    private static int calcTotalDays(Day s, Day e) {
        int daysFromStart = (s.year * 360) + ((s.month - 1) * 30) + s.day;
        int daysToEnd = (e.year * 360) + ((e.month - 1) * 30) + e.day;
        return daysToEnd - daysFromStart;
    }

    private static int calcAnnualLeave(int totalYears) {
        int leave = 0;
        for (int i = 1; i <= totalYears; i++) {
            leave += 15 + (i - 1) / 2;
        }
        return leave;
    }

    private static int calcMonthlyLeave(int totalMonths) {
        return Math.min(totalMonths, 36);
    }
}
