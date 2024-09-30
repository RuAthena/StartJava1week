public class CyclesTheme {
    public static void main(String[] args) {
        // Задание 1. Подсчет суммы четных и нечетных чисел
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int min = -10;
        int max = 21;
        int evenSum = 0;
        int oddSum = 0;
        int current = min;

        do {
            if (current % 2 == 0) {
                evenSum += current;
            } else {
                oddSum += current;
            }
            current++;
        } while (current <= max);

        System.out.printf("В отрезке [%d, %d] сумма четных чисел = %d, а нечетных = %d%n", min, max, evenSum, oddSum);

        System.out.println();

        // Задание 2. Вывод чисел между min и max в порядке убывания
        System.out.println("2. Вывод чисел между min и max в порядке убывания");
        int a = 10;
        int b = 5;
        int c = -1;
        int minNum = a;
        int maxNum = a;

        if (b < minNum) minNum = b;
        if (b > maxNum) maxNum = b;
        if (c < minNum) minNum = c;
        if (c > maxNum) maxNum = c;

        for (int i = maxNum - 1; i > minNum; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println();

        // Задание 3. Вывод реверсивного числа и суммы его цифр
        System.out.println("3. Вывод реверсивного числа и суммы его цифр");
        int number = 1234;
        int reverse = 0;
        int sumOfDigits = 0;

        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            sumOfDigits += digit;
            number /= 10;
        }

        System.out.println("Реверсивное число: " + reverse);
        System.out.println("Сумма цифр: " + sumOfDigits);

        System.out.println();

        // Задание 4. Вывод чисел в несколько строк
        System.out.println("4. Вывод чисел в несколько строк");
        for (int i = 1, count = 0; i < 24; i++) {
            if (i % 2 != 0) {
                System.out.printf("%2d%s", i, (count == 4) ? "\\n" : "  ");
                count = (count + 1) % 5;
            }
        }

        System.out.println();

        // Задание 5. Проверка количества двоек числа на четность/нечетность
        System.out.println("5. Проверка количества двоек числа на четность/нечетность");
        int numberToCheck = 3242592;
        int countTwos = 0;

        int temp = numberToCheck;
        while (temp > 0) {
            if (temp % 10 == 2) {
                countTwos++;
            }
            temp /= 10;
        }

        System.out.printf("В %d нечетное (%d) количество двоек%n", numberToCheck, countTwos);

        System.out.println();

        // Задание 6. Вывод геометрических фигур
        System.out.println("6. Вывод геометрических фигур");

        // Прямоугольник
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // Прямоугольный треугольник
        int height = 5;
        int row = 0;
        while (row < height) {
            for (int j = 0; j <= row; j++) {
                System.out.print("#");
            }
            System.out.println();
            row++;
        }

        System.out.println();

        // Равнобедренный треугольник
        int base = 5;
        int line = 1;
        do {
            for (int j = 0; j < base - line; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * line - 1; j++) {
                System.out.print("$");
            }
            System.out.println();
            line++;
        } while (line <= height);

        System.out.println();

        // Задание 7. Вывод ASCII-символов
        System.out.println("7. Вывод ASCII-символов");
        System.out.printf("%-10s %-10s %-30s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        System.out.println("-------------------------------------------------------------");

        for (int i = 33; i < 58; i += 2) {
            System.out.printf("%-10d %-10c %-30s%n", i, (char) i, Character.getName(i));
        }

        for (int i = 97; i < 123; i += 2) {
            System.out.printf("%-10d %-10c %-30s%n", i, (char) i, Character.getName(i));
        }

        System.out.println();

        // Задание 8. Проверка, является ли число палиндромом
        System.out.println("8. Проверка, является ли число палиндромом");
        int palindromeCheck = 1234321;
        int original = palindromeCheck;
        int reversedNumber = 0;

        while (palindromeCheck > 0) {
            reversedNumber = reversedNumber * 10 + palindromeCheck % 10;
            palindromeCheck /= 10;
        }

        if (original == reversedNumber) {
            System.out.printf("Число %d - палиндром%n", original);
        } else {
            System.out.printf("Число %d - не палиндром%n", original);
        }

        System.out.println();

        // Задание 9. Проверка, является ли число счастливым
        System.out.println("9. Проверка, является ли число счастливым");
        int luckyNumber = 123321;
        int firstHalfSum = 0;
        int secondHalfSum = 0;

        int tempLucky = luckyNumber;
        for (int i = 0; i < 3; i++) {
            firstHalfSum += tempLucky % 10;
            tempLucky /= 10;
        }

        for (int i = 0; i < 3; i++) {
            secondHalfSum += tempLucky % 10;
            tempLucky /= 10;
        }

        if (firstHalfSum == secondHalfSum) {
            System.out.printf("Число %d - счастливое%n", luckyNumber);
        } else {
            System.out.printf("Число %d - не счастливое%n", luckyNumber);
        }

        System.out.println("Сумма цифр 123 = " + firstHalfSum);
        System.out.println("Сумма 321 = " + secondHalfSum);

        System.out.println();

        // Задание 10. Вывод таблицы умножения Пифагора
        System.out.println("10. Вывод таблицы умножения Пифагора");
        System.out.printf("%s", " | ");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%2d ", i);
        }
        System.out.println();
        System.out.println("---------------------------------------");

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%2d|", i);
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%2d ", i * j);
            }
            System.out.println();
        }
    }
}
