package bj_24_10_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            float num = Float.parseFloat(st.nextToken());
            String unit = st.nextToken();

            if (unit.equals("kg")) {
                System.out.printf("%.4f lb\n", num * 2.2046);
            } else if (unit.equals("lb")) {
                System.out.printf("%.4f kg\n", num * 0.4536);
            } else if (unit.equals("l")) {
                System.out.printf("%.4f g\n", num * 0.2642);
            } else if (unit.equals("g")) {
                System.out.printf("%.4f l\n", num * 3.7854);
            }
        }
    }
}
