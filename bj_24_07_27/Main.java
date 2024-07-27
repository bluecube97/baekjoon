package bj_24_07_27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        List<String> leftWord = new ArrayList<>(List.of("q", "w", "e", "r", "t", "y", "a", "s", "d", "f", "g", "z", "x", "c", "v", "b"));
        List<String> rightWord = new ArrayList<>(List.of("u", "i", "o", "p", "h", "j", "k", "l", "n", "m"));
        for (int i = 0; i < 16; i++) {
            leftWord.add(leftWord.get(i).toUpperCase());
        }
        for (int i = 0; i < 10; i++) {
            rightWord.add(rightWord.get(i).toUpperCase());
        }

        int left = 0;
        int right = 0;
        int shiftCnt = 0;

        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z' && leftWord.contains(String.valueOf(c))) {
                left++;
            } else if (c >= 'a' && c <= 'z' && rightWord.contains(String.valueOf(c))) {
                right++;
            } else if (c >= 'A' && c <= 'Z' && leftWord.contains(String.valueOf(c))) {
                left++;
                shiftCnt++;
            } else if (c >= 'A' && c <= 'Z' && rightWord.contains(String.valueOf(c))) {
                right++;
                shiftCnt++;
            } else if (c == ' ') {
                shiftCnt++;
            }
        }

        while (shiftCnt > 0) {
            if (right >= left) {
                left++;
            } else {
                right++;
            }
            shiftCnt--;
        }
        System.out.println(left + " " + right);
    }
}
