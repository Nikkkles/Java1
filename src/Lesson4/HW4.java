package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        // было до метода инициализации: String[][] map = new String[3][3];
        String[][] map = initField(3); // так инициализировали карту размером 3х3
        boolean isGameActive = true;
        System.out.println("Игра началась!");

        printMap(map);
        while (isGameActive) {
            player(map);
            printMap(map);
            if (isWinner("X", map) || isDraw(map)) {
                isGameActive = false;
                break;
            }

            computer(map);
            printMap(map);
            if (isWinner("0", map) || isDraw(map)) {
                isGameActive = false;
                break;
            }
        }

    }
    // проверка победителя
    public static boolean isWinner(String mark, String[][] map) { // Mark - передаем X или 0
        // всего 3 проверки: горизонталь, вертикаль, диагональ
        for (int i = 0; i < map.length; i++) { // горизонт
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j].equals(mark)) {
                    System.out.println("Победил " + mark);
                    return true;
                }
            }
        }
        for (int i = 0; i < map.length; i++) { // вертикаль
            for (int j = 0; j < map[0].length; j++) {
                if (map[j][i].equals(mark)) {
                    System.out.println("Победил " + mark);
                    return true;
                }
            }
        }
        for (int i = 0; i < map.length; i++) { // диагональ
            for (int j = 0; j < map[0].length; j++) {
                if ((map[i][j].equals(mark)) && map[i][j] == map[0][0]) {
                    System.out.println("Победил " + mark);
                    return true;
                } else if ((map[i][j].equals(mark)) && map[i].length == map[0].length) {
                    System.out.println("Победил " + mark);
                    return true;
                }
            }
        }
        return false;
    }

    // проверка на ничью
    public static boolean isDraw(String[][] map) {

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {

                if (map[i][j].equals("*")) {
                    return false;
                }
            }
        }
        System.out.println("Ничья, получается");
        return true;
    }

    public static void player(String[][] map) {
        System.out.println("Ход игрока. Куда?");

        Scanner sc = new Scanner(System.in);

        boolean isActiveTurn = true;

        // нужно учесть 0 и Х (то есть нельзя ходить на уже занятые клетки. Свободные - *)
        // учесть границы поля
        // нужно проверить сходил ли игрок. При еёэтом неверная попытка сходить не должна считаться. Поэтому выше вводим цикл while и еще выше переменную
        while (isActiveTurn) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if ((x > 0 && x <= map[0].length) && (y > 0 && y <= map.length)) {
                if (map[x - 1][y - 1].equals("*")) {
                    map[x-1][y-1] = "X";
                    isActiveTurn = false;
                } else {
                    System.out.println("Клетка занята");
                }
            } else {
                System.out.println("Вышли за пределы поля");
            }
        }
    }


    public static void computer(String[][] map) {
        System.out.println("Комрьтер ходит");

        Random rnd = new Random();

        boolean isActiveTurn = true;

        while (isActiveTurn) {
            int x = rnd.nextInt(map[0].length);
            int y = rnd.nextInt(map.length);

            if (map[x][y].equals("*")) {
                map[x][y] = "0";
                isActiveTurn = false;
            }
        }
        System.out.println("Компьютер сходил");
    }

    public static void printMap(String[][] map) { // вывод инициализированной карты на экран
        for (int i = 0; i < map.length; i++) { // map.length - сколько массивов в массиве
            for (int j = 0; j < map[0].length; j++) { // map[0].lenhth - это узнаем длину массива под индексом 0 в массиве массивов
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }


    // метод инициализации поля. Возвращает строковое поле в соответствии с размером. Массив заполняется * в каждой ячейке.
    public static String[][] initField(int size) { // переменную задали прям здесь (как первое упоминание)
        String[][] map = new String[size][size];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = "*";
            }
        }
        return map;
    }
}