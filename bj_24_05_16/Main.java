package bj_24_05_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int length = Integer.parseInt(st.nextToken());
        int calCnt = Integer.parseInt(st.nextToken());
        int[] arr = new int[length];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int shift = 0; // 오른쪽 시프트하면 +, 왼쪽 시프트하면 -

        for (int i = 0; i < calCnt; i++) {
            st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());

            switch (command) {
                case 1:
                    int index = Integer.parseInt(st.nextToken()) - 1;
                    int value = Integer.parseInt(st.nextToken());
                    int shiftIndex = ((index - shift) % length + length) % length;
                    arr[shiftIndex] += value;
                    break;
                case 2:
                    shift = (shift + Integer.parseInt(st.nextToken())) % length;
                    break;
                case 3:
                    shift = (shift - Integer.parseInt(st.nextToken()) + length) % length;
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(arr[(i - shift + length) % length]).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
