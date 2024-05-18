package bj_24_05_18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static class Form {
        int weight;
        int height;
        int rank = 1;

        Form(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Form> studentList = new ArrayList<>();
        int studentCnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < studentCnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            studentList.add(new Form(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        for (Form student : studentList) {
            for (Form comStudent : studentList) {
                if (student.weight < comStudent.weight && student.height < comStudent.height) {
                    student.rank++;
                }
            }
        }

        for (Form student : studentList) {
            System.out.print(student.rank + " ");
        }

    }
}
