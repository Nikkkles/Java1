package Lesson2;

import java.util.Scanner;

public class HW22 {
    public static void main(String[] args) {
        System.out.println("Задание 1. Введите 2 целых числа");
        System.out.println(isBetween());
        System.out.println();
        System.out.println("Задание 2");
        isNegativeOrPositive(4);
        System.out.println();
        System.out.println("Задание 3:");
        System.out.println(isNegative(-2));
        System.out.println();
        System.out.println("Задание 4:");
        System.out.println(printWords("Учиться", 10));
        System.out.println();
        System.out.println("Задание 5*:");
        System.out.println(isShort());
    }

    //Задание 1. Судя по подсказкам в методичке нужно вносить значения переменных, я ради эксперимента  решил сделать ввод через консоль
    public static boolean isBetween() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        boolean result = sum >= 10 && sum <= 20;
        return result;
        }

    // Задание 2
    public static void isNegativeOrPositive(int a) {;
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }

    }


    // Задание 3
    public static boolean isNegative(int a) {
        boolean result = a < 0;
        return result;
    }

    // Задание 4
    public static String printWords(String word, int num) {
        int stop = num;
        for (num = 0; num <= stop; num++) {
            System.out.println(word);
        }
        return word;
    }


    // Задание 5. Также сделал ввод года в терминале
    public static boolean isShort() {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean result = (year % 4 == 0) && (!(year % 100 == 0)) || (year % 400 == 0);
        return result;
    }
}



