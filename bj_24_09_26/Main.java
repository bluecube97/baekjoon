package bj_24_09_26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        float a = Integer.parseInt(st.nextToken());
        float b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        float c = Integer.parseInt(st.nextToken());
        float d = Integer.parseInt(st.nextToken());

        float max = a / c + b / d;
        int rotate = 0;

        float sum = c / d + a / b;
        if (sum > max) {
            max = sum;
            rotate = 1;
        }

        sum = d / b + c / a;
        if (sum > max) {
            max = sum;
            rotate = 2;
        }

        sum = b / a + d / c;
        if (sum > max) {
            max = sum;
            rotate = 3;
        }

        System.out.println(rotate);

    }
}
