package bj_24_03_19_1;

import java.util.*;

// 재도전 요망
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int que_size = sc.nextInt();
        int ext_cnt = sc.nextInt();
        int result = 0;
        List<Integer> que_list = new ArrayList<>();
        List<Integer> find_idx = new ArrayList<>();

        for (int i = 0; i < que_size; i++) {
            que_list.add(i + 1);
        }

        for (int i = 0; i < ext_cnt; i++) {
            find_idx.add(sc.nextInt());
        }

        for (int i = 0; i < ext_cnt; i++) {
            if (find_idx.get(i).equals(que_list.get(0))) {
                que_list.remove(0);
            } else {
                for (int j = 0; ; j++) {
                    if (find_idx.get(i).equals(que_list.get(0))) {
                        que_list.remove(0);
                        break;
                    }
                    if (find_idx.get(i).equals(que_list.get(j))) {
                        for (int k = 0; k < que_list.size() / 2; k++) {
                            if (que_list.size() % 2 != 0) {
                                if (j <= que_list.size() / 2 + 1) {
                                    calc2(que_list);
                                    result++;
                                } else if (j > que_list.size() / 2 + 1){
                                    calc3(que_list);
                                    result++;
                                }
                            } else {
                                if (j < que_list.size() / 2) {
                                    calc2(que_list);
                                    result++;
                                } else if (j >= que_list.size() / 2){
                                    calc3(que_list);
                                    result++;
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(result);

    }

    public static List<Integer> calc2(List<Integer> list) {
        int temp = list.get(0);
        for (int i = 0; i < list.size() - 1; i++) {
            list.set(i, list.get(i + 1));
        }
        list.set(list.size() - 1, temp);

        return list;
    }

    public static List<Integer> calc3(List<Integer> list) {
        int temp = list.get(list.size() - 1);
        for (int i = list.size() - 1; i > 0; i--) {
            list.set(i, list.get(i - 1));
        }
        list.set(0, temp);

        return list;
    }
}
