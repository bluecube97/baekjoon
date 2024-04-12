package bj_24_04_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 유저 수, 관계 수 입력
        int user_cnt = Integer.parseInt(st.nextToken());
        int relation_cnt = Integer.parseInt(st.nextToken());

        // relation[a][b] 이면 a와 b의 관계를 나타내는 배열
        int[][] relation = new int[user_cnt + 1][user_cnt + 1];
        for (int i = 1; i <= user_cnt; i++) {
            Arrays.fill(relation[i], 10000);
            // 자기 자신과의 관계는 0으로 초기화
            relation[i][i] = 0;
        }

        // a와 b의 관계 입력
        for (int i = 0; i < relation_cnt; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            relation[a][b] = 1;
            relation[b][a] = 1;
        }

        // 플로이드 와샬 알고리즘
        for (int k = 1; k <= user_cnt; k++) {
            for (int i = 1; i <= user_cnt; i++) {
                for (int j = 1; j <= user_cnt; j++) {
                    relation[i][j] = Math.min(relation[i][j], relation[i][k] + relation[k][j]);
                }
            }
        }

        // 결과 출력
        int min = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 1; i <= user_cnt; i++) {
            int sum = 0;
            for (int j = 1; j <= user_cnt; j++) {
                sum += relation[i][j];
            }
            if (min > sum) {
                min = sum;
                result = i;
            }
        }

        System.out.println(result);

    }

}
