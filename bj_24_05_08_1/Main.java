package bj_24_05_08_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> list = new LinkedList<>();

        int testcase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < testcase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String command = st.nextToken();
            int num = 0;
            if (st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
            }

            switch (command) {
                case "push_front":
                    list.addFirst(num);
                    break;
                case "push_back":
                    list.addLast(num);
                    break;
                case "pop_front":
                    if (list.isEmpty()) sb.append("-1").append("\n");
                    else {
                        sb.append(list.getFirst()).append("\n");
                        list.removeFirst();
                    }
                    break;
                case "pop_back":
                    if (list.isEmpty()) sb.append("-1").append("\n");
                    else {
                        sb.append(list.getLast()).append("\n");
                        list.removeLast();
                    }
                    break;
                case "size":
                    sb.append(list.size()).append("\n");
                    break;
                case "empty":
                    if (list.isEmpty()) sb.append("1").append("\n");
                    else sb.append("0").append("\n");
                    break;
                case "front":
                    if (list.isEmpty()) sb.append("-1").append("\n");
                    else sb.append(list.getFirst()).append("\n");
                    break;
                case "back":
                    if (list.isEmpty()) sb.append("-1").append("\n");
                    else sb.append(list.getLast()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
