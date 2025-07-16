package ru.astondevs;

import java.util.Scanner;

public class StringComparer {
    public static void run(Scanner scanner) {
        scanner.nextLine(); // Очистка буфера после nextInt()
        System.out.println("Введите первую строку:");
        String a = scanner.nextLine();
        System.out.println("Введите вторую строку:");
        String b = scanner.nextLine();

        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}
