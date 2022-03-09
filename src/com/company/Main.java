package com.company;

public class Main {

    public static void main(String[] args) {
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

        int p;
        p = 5;
        while (p <= 31) {
            System.out.println("Сегодня пятница, " + p + "-е число. Необходимо подготовить отчет.");
            p += 5;
            //Сегодня пятница, ...-е число. Необходимо подготовить отчет.
        }
        int pr, b_y, res;
        pr = (2022 - 200);
        b_y = (2022 + 100);
        for (res = 0; res <= b_y; res += 79) {
            if (res < pr)
             continue;

        System.out.println(res);
    }
    }
}
