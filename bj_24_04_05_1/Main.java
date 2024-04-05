package bj_24_04_05_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int people = Integer.parseInt(br.readLine());
        String[] peopleInfo = new String[people];

        for (int i = 0; i < people; i++) {
            peopleInfo[i] = br.readLine();
        }

        List<HashMap<String, Object>> peopleList = new ArrayList<>();

        for (int i = 0; i < people; i++) {
            HashMap<String, Object> peopleMap = new HashMap<>();
            peopleMap.put("age", peopleInfo[i].split(" ")[0]);
            peopleMap.put("name", peopleInfo[i].split(" ")[1]);
            peopleMap.put("order", i + 1);
            peopleList.add(peopleMap);
        }

        peopleList.sort((o1, o2) -> {
            if (Integer.parseInt(o1.get("age").toString()) == Integer.parseInt(o2.get("age").toString())) {
                return Integer.compare((int) o1.get("order"), (int) o2.get("order"));
            } else {
                return Integer.compare(Integer.parseInt(o1.get("age").toString()), Integer.parseInt(o2.get("age").toString()));
            }
        });

        for (int i = 0; i < people; i++) {
            System.out.println(peopleList.get(i).get("age") + " " + peopleList.get(i).get("name"));
        }

    }
}
