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
        System.out.println("\n" + "Task four");
        for (int l = 1; l <=30; l++) {
        //System.out.println( l + ":");
        if ( l % 3 ==0)
        System.out.println(l + ":" + "ping");
        else if (l % 3 ==0 && l % 5 ==0)
        System.out.println(l + ":" + "ping pong");
        else if (l % 5 ==0)
        System.out.println(l + ":" + "pong");
        else
            System.out.println( l + ":");


        }
        System.out.println("\n" + "Task five");
        int n0 = 0;
        int n1 = 1;
        int n2 = n0 + n1;
        System.out.print(n0 + " " + n1 + " "+ n2 + " ");
        i=1;
        while (i < 11){
            i++;
           n0 = n1;
           n1 = n2;
           n2 = (n0 + n2);
            System.out.print(n2+ " ");
        }
        System.out.println("\n" + "Task six");
      int age = 19;
        float salary = 58_000f;
        if (age >= 23 && salary < 50_000) {
            float sum = salary * 3;
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + sum + " рублей");
        }
        else if (age >= 23 && salary > 50_000 && salary < 80_000) {
            float sum = salary * 3 * 1.2f;
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + sum + " рублей");
        }
        else if (age >= 23 && salary > 80_000) {
            float sum = salary * 3 * 1.3f;
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + sum + " рублей");
        }
        else if (age < 23f && salary > 80_000f) {
                float sum = salary * 2f * 1.3f;
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + sum + " рублей");
            }
        else if (age < 23f && salary > 50_000f && salary < 80_000) {
            float sum = salary * 2f * 1.2f;
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + sum + " рублей");
        }
        else if (age < 23f && salary < 50_000f) {
            float sum = salary * 2f;
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + sum + " рублей");
        }
        System.out.println("\n" + "Task seven");
        int ege = 25;
        float salary1 = 60_000;
        float wantedSum = 330_000;
        float baseRate = 10f;
        float creditTern = 12f;
        float maxPayment = salary * 0.5f;
        if (age < 23)
            baseRate = baseRate + 1;
        else if (age > 23 && age < 30)
            baseRate = baseRate + 0.5f;
        else if (salary > 80_000)
            baseRate = baseRate - 0.7f;
        baseRate = baseRate;
        float payment = (wantedSum * baseRate) / creditTern;
        if (payment > maxPayment)
            System.out.println("Максимальный платеж при ЗП " +  salary + " равен " +
                    maxPayment + " рублей. Платеж по кредиту " + payment + " рублей. Отказано!».");
        else
        System.out.println("Максимальный платеж при ЗП " +  salary + " равен " +
                maxPayment + " рублей. Платеж по кредиту " + payment + " рублей. Одобрено!».");

        }
        }


