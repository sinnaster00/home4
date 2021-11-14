package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> A = new ArrayList<>();
        System.out.println("Введите имя... ");
        for (int i = 0; i < 5; i++) {
            String usersadd;
            usersadd = scanner.nextLine();
            A.add(usersadd);
        }
        System.out.println("Список А: " + A);
        ArrayList<String> B = new ArrayList<>();
        System.out.println("-------------------------");
        System.out.println("Введите имя...");
        for (int i = 0; i < 5; i++) {
            String usersadd;
            usersadd = scanner.nextLine();
            B.add(usersadd);
        }
        System.out.println("Список B - " + B);
        ArrayList<String> C = new ArrayList<>();
        C.add(A.get(0));
        C.add(B.get(4));
        C.add(A.get(1));
        C.add(B.get(3));
        C.add(A.get(2));
        C.add(B.get(2));
        C.add(A.get(3));
        C.add(B.get(1));
        C.add(A.get(4));
        C.add(B.get(0));
        System.out.println("___________");
        System.out.println("Список С: " + C );
        Collections.sort(C, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println("После сортировки С = " + C);
    }
}