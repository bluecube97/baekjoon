package bj_24_03_27;

import java.util.*;

// https://inpa.tistory.com/entry/JAVA-%E2%98%95-LinkedList-%EA%B5%AC%EC%A1%B0-%EC%82%AC%EC%9A%A9%EB%B2%95-%EC%99%84%EB%B2%BD-%EC%A0%95%EB%B3%B5%ED%95%98%EA%B8%B0
// https://www.acmicpc.net/problem/11866
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int people = sc.nextInt();
        int cnt = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> resultList = new LinkedList<>();

        for (int i = 0; i < people; i++) {
            list.addLast(i + 1);
        }

        for (int i = cnt; resultList.size() == people; i += cnt) {
            while (cnt > list.size()) {
                cnt -= list.size();
            }
            resultList.add(list.get(cnt));
            list.remove(cnt);
        }

        System.out.println(resultList);
    }
}
