package ru.astondevs;

import java.util.Scanner;

public class NumberOperations {
    public static void run(Scanner scanner) {
        // Считывание чисел с помощью метода, содержащего проверку ввода
        int a = readInt(scanner, "Введите первое целое число (a):");
        int b = readInt(scanner, "Введите второе целое число (b):");

        // Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Арифметические операции
        System.out.println("Сложение: " + (a + b));
        System.out.println("Вычитание: " + (a - b));
        if (b != 0) {
            System.out.println("Деление: " + ((double) a / b));
        } else {
            System.out.println("Деление: на ноль делить нельзя");
        }
        System.out.println("Умножение: " + (a * b));
    }

    // Метод для ввода целого числа с проверкой
    private static int readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.println(prompt);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Ошибка: нужно ввести целое число. Повторите попытку.");
                scanner.next(); // Очистка некорректного ввода
            }
        }
    }
}
