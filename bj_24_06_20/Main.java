package bj_24_06_20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        float minPrice = (float) Integer.parseInt(st.nextToken()) / Integer.parseInt(st.nextToken());

        int storeCount = Integer.parseInt(br.readLine());
        for (int i = 0; i < storeCount; i++) {
            st = new StringTokenizer(br.readLine());
            float storePrice = (float) Integer.parseInt(st.nextToken()) / Integer.parseInt(st.nextToken());
            minPrice = Math.min(minPrice, storePrice);
        }

        System.out.printf("%.2f%n", minPrice * 1000);
    }
}
