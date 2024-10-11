package bj_24_10_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 1;

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double diameter = Double.parseDouble(st.nextToken());
            int round = Integer.parseInt(st.nextToken());
            double time = Double.parseDouble(st.nextToken());
            if (round == 0) break;

            double diameterInMiles = diameter / 12 / 5280;
            double timeInHours = time / 3600;

            double dist = diameterInMiles * 3.1415927 * round;
            double MPH = dist / timeInHours;
            System.out.printf("Trip #%d: %.2f %.2f%n", count, dist, MPH);
            count++;
        }
    }
}
