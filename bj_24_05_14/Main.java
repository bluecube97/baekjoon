package bj_24_05_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Document {
    int index;
    int priority;

    public Document(int index, int priority) {
        this.index = index;
        this.priority = priority;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testcase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int docCnt = Integer.parseInt(st.nextToken());
            int target = Integer.parseInt(st.nextToken());
            Queue<Document> queue = new LinkedList<>();
            int[] priority = new int[10];

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < docCnt; j++) {
                int priorityValue = Integer.parseInt(st.nextToken());
                queue.add(new Document(j, priorityValue));
                priority[priorityValue]++;
            }

            int printCnt = 0;
            while (!queue.isEmpty()) {
                Document doc = queue.poll();
                boolean isPrint = true;

                for (int j = doc.priority + 1; j < 10; j++) {
                    if (priority[j] > 0) {
                        isPrint = false;
                        break;
                    }
                }

                if (isPrint) {
                    printCnt++;
                    priority[doc.priority]--;
                    if (doc.index == target) {
                        System.out.println(printCnt);
                        break;
                    }
                } else {
                    queue.add(doc);
                }
            }
        }
    }
}
