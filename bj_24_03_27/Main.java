package bj_24_03_27;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int people = sc.nextInt();
        int cnt = sc.nextInt() - 1;

        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> resultList = new LinkedList<>();

        for (int i = 0; i < people; i++) {
            list.addLast(i + 1);
        }

        for (int i = cnt; resultList.size() < people; i += cnt) {
            while (i >= list.size()) {
                i -= list.size();
            }
            resultList.add(list.get(i));
            list.remove(i);
        }

        System.out.print("<");
        for (int i = 0; i < resultList.size() - 1; i++) {
            System.out.print(resultList.get(i) + ", ");
        }

        System.out.print(resultList.getLast());
        System.out.println(">");

    }
}
