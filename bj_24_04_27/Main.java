package bj_24_04_27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        int result = 0;
        List<String> input = new ArrayList<>();
        List<String> store = new ArrayList<>();

        for (int i = 0; i < testCase; i++) {
            String inputVal = br.readLine();
            char[] inputValArr = inputVal.toCharArray();
            Arrays.sort(inputValArr);
            input.add(Arrays.toString(inputValArr));
        }

        for (int i = 0; i < input.size(); i++) {
            if (!store.contains(input.get(i))) {
                store.add(input.get(i));
                result++;
            }
        }

        System.out.println(result);
    }
}
