package ru.astondevs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        // Выбор подпрограммы - запрос числа с проверкой ввода
        while (true) {
            System.out.println("Введите 1, 2 или 3 для выбора подпрограммы:\n" +
                    "1 - ввод двух целых чисел, вывод результатов сравнения и арифметических операций;\n" +
                    "2 - ввод двух строк и вывод результата проверки их идентичности;\n" +
                    "3 - вывод четных элементов заранее заданного массива.");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice >= 1 && choice <= 3) {
                    break;
                }
            } else {
                scanner.next(); // Сброс неверного ввода
            }
            System.out.println("Ошибка, неверный ввод.");
        }

        // Вызов выбранной подпрограммы
        switch (choice) {
            case 1:
                NumberOperations.run(scanner);
                break;
            case 2:
                StringComparer.run(scanner);
                break;
            case 3:
                EvenNumbersPrinter.run();
                break;
        }

        scanner.close();
    }
}