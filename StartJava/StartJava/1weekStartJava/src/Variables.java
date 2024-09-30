public class Variables {
    public static void main(String[] args) {
        // Задача 1: Вывод характеристик компьютера
        System.out.println("1. Вывод характеристик компьютера");
        int cores = 8; // количество ядер
        double frequency = 3.6; // частота процессора в ГГц
        long ram = 16_000_000_000L; // объем ОЗУ в байтах
        System.out.println("Количество ядер: " + cores);
        System.out.println("Частота процессора: " + frequency + " ГГц");
        System.out.println("Объем ОЗУ: " + (ram / (1024 * 1024)) + " МБ");

        System.out.println(); // пустая строка

        // Задача 2: Расчет стоимости товара со скидкой
        System.out.println("2. Расчет стоимости товара со скидкой");
        double penPrice = 105.50; // цена ручки
        double bookPrice = 235.83; // цена книги
        double discount = 0.11; // скидка
        double totalPrice = penPrice + bookPrice;
        double discountAmount = totalPrice * discount;
        double finalPrice = totalPrice - discountAmount;
        System.out.printf("Стоимость товаров без скидки: %.2f\\n", totalPrice);
        System.out.printf("Сумма скидки: %.2f\\n", discountAmount);
        System.out.printf("Стоимость товаров со скидкой: %.2f\\n", finalPrice);

        System.out.println(); // пустая строка

        // Задача 3: Вывод слова JAVA
        System.out.println("3. Вывод слова JAVA");
        System.out.println("    J    a  v     v  a");
        System.out.println("    J   a a  v   v  a a");
        System.out.println(" J  J  aaaaa  V V  aaaaa");
        System.out.println("  JJ  a     a  V  a     a");

        System.out.println(); // пустая строка

        // Задача 4: Вывод min и max значений целых числовых типов
        System.out.println("4. Вывод min и max значений целых числовых типов");
        byte byteMax = Byte.MAX_VALUE;
        short shortMax = Short.MAX_VALUE;
        int intMax = Integer.MAX_VALUE;
        long longMax = Long.MAX_VALUE;

        // Byte
        System.out.println("byte: " + byteMax);
        System.out.println("byte + 1: " + (byteMax + 1));
        System.out.println("byte - 1: " + (byteMax - 1));

        // Short
        System.out.println("short: " + shortMax);
        System.out.println("short + 1: " + (shortMax + 1));
        System.out.println("short - 1: " + (shortMax - 1));

        // Integer
        System.out.println("int: " + intMax);
        System.out.println("int + 1: " + (intMax + 1));
        System.out.println("int - 1: " + (intMax - 1));

        // Long
        System.out.println("long: " + longMax);
        System.out.println("long + 1: " + (longMax + 1));
        System.out.println("long - 1: " + (longMax - 1));

        System.out.println(); // пустая строка

        // Задача 5: Перестановка значений переменных
        System.out.println("5. Перестановка значений переменных");
        int a = 2;
        int b = 5;

        System.out.println("Исходные значения: a = " + a + ", b = " + b);

        // Способ 1: с помощью третьей переменной
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Способ 1: с помощью третьей переменной: a = " + a + ", b = " + b);

        // Возврат к исходным значениям
        a = 2;
        b = 5;

        // Способ 2: с помощью арифметических операций
        a = a + b; // a = 7
        b = a - b; // b = 2
        a = a - b; // a = 5
        System.out.println("Способ 2: с помощью арифметических операций: a = " + a + ", b = " + b);

        // Возврат к исходным значениям
        a = 2;
        b = 5;

        // Способ 3: с помощью побитовой операции ^
        a = a ^ b; // a = 7
        b = a ^ b; // b = 2
        a = a ^ b; // a = 5
        System.out.println("Способ 3: с помощью побитовой операции ^: a = " + a + ", b = " + b);

        System.out.println(); // пустая строка

        // Задача 6: Вывод символов и их кодов
        System.out.println("6. Вывод символов и их кодов");
        char char1 = '$'; // код 36
        char char2 = '*'; // код 42
        char char3 = '@'; // код 64
        char char4 = '|'; // код 124
        char char5 = '~'; // код 126

        System.out.printf("%d : %c\\n", (int) char1, char1);
        System.out.printf("%d : %c\\n", (int) char2, char2);
        System.out.printf("%d : %c\\n", (int) char3, char3);
        System.out.printf("%d : %c\\n", (int) char4, char4);
        System.out.printf("%d : %c\\n", (int) char5, char5);

        System.out.println(); // пустая строка

        // Задача 7: Вывод в консоль ASCII-арт Дюка
        System.out.println("7. Вывод в консоль ASCII-арт Дюка");
        char backslash = '\\\\';
        char space = ' ';
        char underscore = '_';
        char openParenthesis = '(';
        char closeParenthesis = ')';

        System.out.println("    /" + backslash);
        System.out.println("   /" + space + backslash);
        System.out.println("  /" + underscore + openParenthesis + closeParenthesis + backslash);
        System.out.println(" /" + space + space + space + backslash);
        System.out.println("/____/" + backslash + backslash + "_" + backslash + backslash);

        System.out.println(); // пустая строка

        // Задача 8: Манипуляции с сотнями, десятками и единицами числа
        System.out.println("8. Манипуляции с сотнями, десятками и единицами числа");
        int number = 543; // число
        int hundreds = number / 100; // сотни
        int tens = (number / 10) % 10; // десятки
        int units = number % 10; // единицы
        int sum = hundreds + tens + units; // сумма разрядов
        int product = hundreds * tens * units; // произведение разрядов

        System.out.printf("Число %d содержит:\\n", number);
        System.out.printf("  сотен - %d\\n", hundreds);
        System.out.printf("  десятков - %d\\n", tens);
        System.out.printf("  единиц - %d\\n", units);
        System.out.printf("Сумма разрядов = %d\\n", sum);
        System.out.printf("Произведение разрядов = %d\\n", product);

        System.out.println(); // пустая строка

        // Задача 9: Перевод секунд в часы, минуты и секунды
        System.out.println("9. Перевод секунд в часы, минуты и секунды");
        int totalSeconds = 86399; // общее количество секунд
        int hours = totalSeconds / 3600; // часы
        int minutes = (totalSeconds % 3600) / 60; // минуты
        int seconds = totalSeconds % 60; // секунды

        System.out.printf("%02d:%02d:%02d\\n", hours, minutes, seconds);
    }

}
