package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task one");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i += 1;
        }

        int a;
        System.out.print("\n");
        for (a = 10; a > 0; a--)
            System.out.print(a + " ");
        System.out.print("\n");
        System.out.println("task too");
        int p;
        int friday = 5;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
            friday += 5;

        }

        System.out.println("Task three");
        int past, future, res;
        past = (2022 - 200);
       future = (2022 + 100);
        for (i = 0; i <= future; i += 79) {
            if (i < past)
             continue;

        System.out.println(i);
    }
    }
}
