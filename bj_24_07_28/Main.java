package bj_24_07_28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String fatherBody = st.nextToken();
        String fatherTail = st.nextToken();

        st = new StringTokenizer(br.readLine());
        String motherBody = st.nextToken();
        String motherTail = st.nextToken();

        TreeSet<String> bird = new TreeSet<>();

        bird.add(fatherBody + " " + fatherBody);
        bird.add(fatherBody + " " + fatherTail);
        bird.add(fatherBody + " " + motherBody);
        bird.add(fatherBody + " " + motherTail);
        bird.add(fatherTail + " " + fatherBody);
        bird.add(fatherTail + " " + fatherTail);
        bird.add(fatherTail + " " + motherBody);
        bird.add(fatherTail + " " + motherTail);

        bird.add(motherBody + " " + fatherBody);
        bird.add(motherBody + " " + fatherTail);
        bird.add(motherBody + " " + motherBody);
        bird.add(motherBody + " " + motherTail);
        bird.add(motherTail + " " + fatherBody);
        bird.add(motherTail + " " + fatherTail);
        bird.add(motherTail + " " + motherBody);
        bird.add(motherTail + " " + motherTail);

        while (!bird.isEmpty()) {
            System.out.println(bird.pollFirst());
        }
    }
}
