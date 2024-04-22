package bj_24_04_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int STRAWBERRY = 0;
        int BANANA = 0;
        int LIME = 0;
        int PLUM = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String fruit = st.nextToken();
            if (fruit.equals("STRAWBERRY")) {
                STRAWBERRY += Integer.parseInt(st.nextToken());
            } else if (fruit.equals("BANANA")) {
                BANANA += Integer.parseInt(st.nextToken());
            } else if (fruit.equals("LIME")) {
                LIME += Integer.parseInt(st.nextToken());
            } else if (fruit.equals("PLUM")) {
                PLUM += Integer.parseInt(st.nextToken());
            }
        }

        if (STRAWBERRY == 5 || BANANA == 5 || LIME == 5 || PLUM == 5) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
