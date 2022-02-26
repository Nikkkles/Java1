package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {

        int[] massiv = new int[6];

        System.out.println("---1---");
        changeNumber();
        System.out.println();
        System.out.println("---2---");
        fillMassive();System.out.println();
        System.out.println("---3---");
        countByTwo();System.out.println();
        System.out.println("---4---");
        fillSquare();System.out.println();
        System.out.println("---5---");
        massiv();System.out.println();
        System.out.println("---6---");
        minValue();System.out.println();
        System.out.println("---7---");
        System.out.println(isEqual(massiv));
        System.out.println();
    }


// Задание 1
    public static void changeNumber() {
        int[] num = {0, 1, 1, 1, 0, 0, 1, 0, 1};
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 0) {
                System.out.print(1 + " ");
            } else {
                System.out.print(0 + " ");
            }
        }
    }

// Задание 2
    public static void fillMassive() {
        int[] massive = new int[100];
        for (int i = 0; i < massive.length; i++) {
            System.out.print((i+1) + " ");
        }
    }

// Задание 3
    public static void countByTwo() {
        int[] mass = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < 6) {
                mass[i] = mass[i] * 2;
            }
            System.out.print(mass[i] + " ");
        }
    }

// Задание 4
    public static void fillSquare() {
        int[][] square = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    //square[i][j] = 1;
                    System.out.print("1");
                } else if (i + j == 4) {
                    //square[i][j] = 1;
                    System.out.print("1");
                } else {
                    //square[i][j] = 0;
                    System.out.print(" ");
                }
            }
        }
    }

// Задание 5
    public static int[][] massiv() {
        System.out.println("Введите 2 числа");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int initialValue = sc.nextInt();
        int abc[][] = new int[len][initialValue];
        return abc;
    }

// Задание 6
    public static int minValue() {
        int massiv[] = {3, 6, 4, 8, 2};
        int minValue = massiv[0];
        for (int i = 1; i < massiv.length; i++) {
            if (massiv[i] < minValue) {
                minValue = massiv[i];
                System.out.println(minValue);
            }
        }
        return minValue;
    }

// Задание 7
        public static boolean isEqual(int[] massiv) {
        boolean border = false;
        int sum = 0; // переменная для суммы элементов в массиве
        int leftSum = 0; // переменная для суммы элементов начиная слева

        for (int i = 0; i < massiv.length; i++) {
            Random rnd = new Random();
            massiv[i] = rnd.nextInt(4);
            System.out.print(massiv[i] + " "); //вывод массива в консоль
            sum += massiv[i];
        }

        System.out.println();
        for (int j = 0; j < massiv.length; j++) {
            leftSum += massiv[j];
                if (leftSum == sum - leftSum) {
                return true;
                }
        }
        return border;
    }
}
