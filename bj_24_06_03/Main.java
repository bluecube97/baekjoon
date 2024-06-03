package bj_24_06_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int chatCnt = Integer.parseInt(br.readLine());
        int result = 0;
        Map<String, Boolean> chatMap = new HashMap<>();

        for (int i = 0; i < chatCnt; i++) {
            String chat = br.readLine();
            if (chat.equals("ENTER")) {
                chatMap.clear();
            } else if (!chatMap.getOrDefault(chat, false)) {
                result++;
                chatMap.put(chat, true);
            }
        }

        System.out.println(result);
    }
}
