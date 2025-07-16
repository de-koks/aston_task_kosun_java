package ru.astondevs;

public class EvenNumbersPrinter {
    public static void run() {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Чётные числа из массива:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println(); // Перенос строки после вывода
    }
}
