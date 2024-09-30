public class IfElseStatementTheme {
    public static void main(String[] args) {
        // Задание 1: Перевод псевдокода на язык Java
        System.out.println("1. Перевод псевдокода на язык Java");

        boolean maleGender = false; // или true;
        if (!maleGender) {
            System.out.println("Это женщина.");
        } else {
            System.out.println("Это мужчина.");
        }

        int age = 20; // тестовый возраст
        if (age > 18) {
            System.out.println("Совершеннолетний.");
        } else {
            System.out.println("Несовершеннолетний.");
        }

        double height = 1.75; // тестовый рост
        if (height < 1.8) {
            System.out.println("Рост меньше 1.8 метра.");
        } else {
            System.out.println("Рост 1.8 метра или больше.");
        }

        char firstLetterOfName = 'I'; // Примерим Имя "Игорь"
        if (firstLetterOfName == 'M') {
            System.out.println("Имя начинается с 'M'.");
        } else if (firstLetterOfName == 'I') {
            System.out.println("Имя начинается с 'I'.");
        } else {
            System.out.println("Имя начинается с другой буквы.");
        }

        System.out.println(); // пустая строка для разделения задач

        // Задание 2: Поиск большего числа
        System.out.println("2. Поиск большего числа");

        int a = 10;
        int b = 20;
        if (a > b) {
            System.out.println(a + " больше чем " + b);
        } else if (b > a) {
            System.out.println(b + " больше чем " + a);
        } else {
            System.out.println("Числа равны.");
        }

        System.out.println(); // пустая строка для разделения задач

        // Задание 3: Проверка числа
        System.out.println("3. Проверка числа");

        int number = -10; // тестовое число
        if (number == 0) {
            System.out.println("Число равно нулю.");
        } else {
            if (number < 0) {
                System.out.print(number + " является отрицательным");
                if (number % 2 == 0) {
                    System.out.println(" и четным.");
                } else {
                    System.out.println(" и нечетным.");
                }
            } else {
                System.out.print(number + " является положительным");
                if (number % 2 == 0) {
                    System.out.println(" и четным.");
                } else {
                    System.out.println(" и нечетным.");
                }
            }
        }

        System.out.println(); // пустая строка для разделения задач

        // Задание 4: Поиск одинаковых цифр в числах
        System.out.println("4. Поиск одинаковых цифр в числах");

        int num1 = 123;
        int num2 = 223;
        boolean hasCommonDigits = false;

        for (int i = 0; i < 3; i++) {
            char digit1 = String.valueOf(num1).charAt(i);
            char digit2 = String.valueOf(num2).charAt(i);
            if (digit1 == digit2) {
                hasCommonDigits = true;
                System.out.println("Цифра " + digit1 + " одинаковая на позиции " + (i + 1));
            }
        }

        if (!hasCommonDigits) {
            System.out.println("Нет одинаковых цифр.");
        }

        System.out.println(); // пустая строка для разделения задач

        // Задание 5: Определение символа по его коду
        System.out.println("5. Определение символа по его коду");

        char code = '\\u0057'; // Тестируемый код
        if (Character.isLetter(code)) {
            if (Character.isUpperCase(code)) {
                System.out.println("'" + code + "' - большая буква.");
            } else {
                System.out.println("'" + code + "' - маленькая буква.");
            }
        } else if (Character.isDigit(code)) {
            System.out.println("'" + code + "' - цифра.");
        } else {
            System.out.println("'" + code + "' - ни буква и ни цифра.");
        }

        System.out.println(); // пустая строка для разделения задач

        // Задание 6: Подсчет начисленных банком %
        System.out.println("6. Подсчет начисленных банком %");

        double depositAmount = 321123.59;
        double interestRate;
        if (depositAmount < 100000) {
            interestRate = 0.05;
        } else if (depositAmount <= 300000) {
            interestRate = 0.07;
        } else {
            interestRate = 0.1;
        }

        double interest = depositAmount * interestRate;
        double totalAmount = depositAmount + interest;

        System.out.println("Сумма вклада: " + depositAmount);
        System.out.println("Сумма начисленного %: " + interest);
        System.out.println("Итоговая сумма с %: " + totalAmount);

        System.out.println(); // пустая строка для разделения задач

        // Задание 7: Определение оценки по предметам
        System.out.println("7. Определение оценки по предметам");

        int historyScore = 59;
        int programmingScore = 92;

        int historyMark;
        int programmingMark;

        if (historyScore <= 60) {
            historyMark = 2;
        } else if (historyScore <= 73) {
            historyMark = 3;
        } else if (historyScore <= 91) {
            historyMark = 4;
        } else {
            historyMark = 5;
        }

        if (programmingScore <= 60) {
            programmingMark = 2;
        } else if (programmingScore <= 73) {
            programmingMark = 3;
        } else if (programmingScore <= 91) {
            programmingMark = 4;
        } else {
            programmingMark = 5;
        }

        double averageMarks = (historyMark + programmingMark) / 2.0;
        double averagePercentage = (historyScore + programmingScore) / 2.0;

        System.out.println("История: " + historyMark);
        System.out.println("Программирование: " + programmingMark);
        System.out.println("Средний балл: " + averageMarks);
        System.out.println("Средний %: " + averagePercentage);

        System.out.println(); // пустая строка для разделения задач

        // Задание 8: Расчет годовой прибыли
        System.out.println("8. Расчет годовой прибыли");

        double monthlySales = 13025.233;
        double rent = 5123.018;
        double productionCost = 9001.729;

        double annualProfit = (monthlySales - rent - productionCost) * 12;

        if (annualProfit >= 0) {
            System.out.printf("Прибыль за год: +%.2f руб.%n", annualProfit);
        } else {
            System.out.printf("Прибыль за год: %.2f руб.%n", annualProfit);
        }
    }

}
