package bj_24_08_24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int homeToSchool = sc.nextInt();
        int schoolToPC = sc.nextInt();
        int PCToAcademy = sc.nextInt();
        int academyToHome = sc.nextInt();

        int sum = homeToSchool + schoolToPC + PCToAcademy + academyToHome;
        System.out.println(sum / 60);
        System.out.println(sum % 60);
    }
}
