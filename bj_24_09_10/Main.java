package bj_24_09_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] cost = new int[N];
        int[] score = new int[N];

        for (int i = 0; i < N; i++) {
            cost[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < M; i++) {
            int B = Integer.parseInt(br.readLine());
            int bestMatch = -1;

            for (int j = 0; j < N; j++) {
                if (cost[j] <= B) {
                    bestMatch = j;
                    break;
                }
            }

            if (bestMatch != -1) {
                score[bestMatch]++;
            }
        }

        int maxVotes = 0;
        int winner = 0;

        for (int i = 0; i < N; i++) {
            if (score[i] > maxVotes) {
                maxVotes = score[i];
                winner = i;
            }
        }

        System.out.println(winner + 1);
    }
}

