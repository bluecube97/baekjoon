package bj_24_06_18_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputLine = br.readLine().split(" ");
        int a = Integer.parseInt(inputLine[0]);
        int b = Integer.parseInt(inputLine[1]);
        int c = Integer.parseInt(inputLine[2]);
        int d = Integer.parseInt(inputLine[3]);

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            String[] pantsInput = br.readLine().split(" ");
            int u = Integer.parseInt(pantsInput[0]);
            int v = Integer.parseInt(pantsInput[1]);

            double xi;
            if (u == c) {
                xi = b;
            } else {
                xi = b + Math.sqrt((double)(u - c) / a);
            }

            if (xi == v) {
                count++;
            }
        }

        System.out.println(count);
    }
}
