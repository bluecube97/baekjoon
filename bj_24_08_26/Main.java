package bj_24_08_26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        boolean[] cup = new boolean[4];
        cup[1] = true;

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if (cup[A] || cup[B]) {
                boolean temp = cup[A];
                cup[A] = cup[B];
                cup[B] = temp;
            }
        }

        for (int i = 1; i <= 3; i++) {
            if (cup[i]) {
                System.out.println(i);
                break;
            }
        }
    }
}
