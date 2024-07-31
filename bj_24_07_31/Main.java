package bj_24_07_31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static class Vector2 {
        public int x;
        public int y;

        public Vector2(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testcase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Vector2 leftBottomA = new Vector2(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            Vector2 rightTopA = new Vector2(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            Vector2 leftBottomB = new Vector2(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            Vector2 rightTopB = new Vector2(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

            // 우리 동아리 포스터 넓이
            int poster = (rightTopA.x - leftBottomA.x) * (rightTopA.y - leftBottomA.y);

            // 겹치는 부분의 각 좌표
            int overlapLeft = Math.max(leftBottomA.x, leftBottomB.x);
            int overlapRight = Math.min(rightTopA.x, rightTopB.x);
            int overlapBottom = Math.max(leftBottomA.y, leftBottomB.y);
            int overlapTop = Math.min(rightTopA.y, rightTopB.y);

            int overlapArea = 0;
            if (overlapLeft < overlapRight && overlapBottom < overlapTop) {
                overlapArea = (overlapRight - overlapLeft) * (overlapTop - overlapBottom);
            }

            int visibleArea = poster - overlapArea;
            System.out.println(visibleArea);
        }
    }
}
