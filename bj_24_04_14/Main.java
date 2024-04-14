package bj_24_04_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int now = 100;
        int chan = Integer.parseInt(br.readLine());
        int broken_btn_cnt = Integer.parseInt(br.readLine());

        if (broken_btn_cnt == 0) {
            System.out.println(Math.min(Math.abs(chan - now), String.valueOf(chan).length()));
            return;
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean[] broken_btn = new boolean[10];

        for (int i = 0; i < broken_btn_cnt; i++) {
            broken_btn[Integer.parseInt(st.nextToken())] = true;
        }

        int min = Math.abs(chan - now);

        for (int i = 0; i < 500000; i++) {
            int len = check(i, broken_btn);
            if (len > 0) {
                int press = Math.abs(chan - i);
                min = Math.min(min, len + press);
            }
            len = check(chan + i, broken_btn);
            if (len > 0) {
                min = Math.min(min, len + i);
            }
        }

        System.out.println(min);

    }

    private static int check(int chan, boolean[] brokenBtn) {
        if (chan == 0) {
            return brokenBtn[0] ? 0 : 1;
        }

        int len = 0;
        while (chan > 0) {
            if (brokenBtn[chan % 10]) {
                return 0;
            }
            len++;
            chan /= 10;
        }

        return len;
    }
}
