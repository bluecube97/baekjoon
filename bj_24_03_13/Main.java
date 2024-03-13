package bj_24_03_13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int goal = sc.nextInt();
        int room = 6;
        int path_room = 1;

        for (int i = 0; ; i++) {
            path_room += room * i;
            if(path_room >= goal){
                System.out.println(i + 1);
                return;
            }
        }
    }
}
