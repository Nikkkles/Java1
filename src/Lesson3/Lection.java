package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Lection {
    public static void main(String[] args) {
        /*
        int day1 = 15;
        int day2 = 10;
        int day3 = 12;
        int day4 = 29;
        int day5 = 20;
        int day6 = 5;
        int day7 = 16; // все это переписано ниже в виде массива
         */

        //объявляем массив: создай в памяти область с таким-то количеством ячеек
        // позднее был создан двумерный массив 7 ячеек по 24 элемента
        int days[][] = new int[7][24];
        int dayTemp[] = getTempForDay();
        /*days[0] = 15;
        days[1] = 20;
        days[2] = 13; // в 3 ячейке инфа с температурой в этот день
        days[3] = 11;
        days[4] = 10;
        days[5] = 12;
        days[6] = 18;
         */

        System.out.println(days[3]);
        System.out.println(days); //выведет "[I@5acf9800", обозначающую ссылку на область памяти;

        // Перебором выводим для всех дней
        for (int i = 0; i < 7; i++) {
            //getTemp(days[i]); - было до двумерного массива
            days[i] = getTempForDay(); // получаем 24 дня
        }

        for (int i = 0; i < 7; i++) { //прохожу по дням
            for (int j = 0; j < 24; j++) { //в каждом дне по 24 раза
                System.out.print(days[i][j] + " ");
            }
            System.out.println();
        }
        // вызов с разбивкой по часам
        for (int i = 0; i < 24; i++) {
            System.out.print(dayTemp[i] + " ");
        }

        /* объявление 4 массивлв без четкого кол-ва элементов внутри
        int tmp[][] = new int[4][];
        //каждому массиву можно заложить свое кол-во элементов
        tmp[0] = new int[3];
        tmp[1] = new int[2];
        tmp[3] = new int[10];
        */




        //просто пример: ввод в терминал 5 слов, после чего система выводит это слово и номер ячейки
        Scanner sc = new Scanner(System.in);

        String[] strings = new String[5];
        //добавление
        for (int i = 0; i < strings.length; i++) { // было i < 5
            strings[i] = sc.nextLine() + " " + i;
        }
        //тут сырывается алгоритм
        //тут делаем вывод
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        //если кол-во ячеек изменится в методе String[5], то цифры нужно менять везде ниже.
        //Альтернативное решение - применение параметра длины массива .lenght



     }


    // пишем программу для обработки погоды в гр по цельсию и печати в консоль
    public static void getTemp(int temp) {
        transformToCells();
        System.out.println(temp);
    }

    // просто пустышка
    public static void transformToCells() {
    }

    // метод для 24 часов в день, который рандомно присваивает температуру (+/- 30) в каждый час
    public static int[] getTempForDay() {
        Random random = new Random();
        int[] dayTemp = new int[24];
        for (int i = 0; i < 24; i++) {
            dayTemp[i] = random.nextInt(30);
        }
        return dayTemp;
    }

}


