package bj_24_07_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        boolean[] brokenTeam = new boolean[N + 1];
        boolean[] spareTeam = new boolean[N + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < S; i++) {
            brokenTeam[Integer.parseInt(st.nextToken())] = true; // 부러졌으면 true
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < R; i++) {
            spareTeam[Integer.parseInt(st.nextToken())] = true; // 여분이 있으면 true
        }

        for (int i = 1; i <= N; i++) {
            if (brokenTeam[i] && spareTeam[i]) {
                brokenTeam[i] = false;
                spareTeam[i] = false;
            }
        }

        for (int i = 1; i <= N; i++) {
            if (!brokenTeam[i]) continue;

            if (i > 1 && spareTeam[i - 1]) {
                brokenTeam[i] = false;
                spareTeam[i - 1] = false;
            } else if (i < N && spareTeam[i + 1]) {
                brokenTeam[i] = false;
                spareTeam[i + 1] = false;
            }
        }

        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (brokenTeam[i]) count++;
        }

        System.out.println(count);
    }
}
