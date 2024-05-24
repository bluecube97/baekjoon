package bj_24_05_24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cheeseCnt = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<String> cheeseList = new ArrayList<>();

        for (int i = 0; i < cheeseCnt; i++) {
            String cheese = st.nextToken();
            if (!cheese.endsWith("Cheese")) continue;
            if (cheeseList.contains(cheese)) continue;
            cheeseList.add(cheese);
        }
        if (cheeseList.size() > 3) System.out.println("yummy");
        else System.out.println("sad");
    }
}
