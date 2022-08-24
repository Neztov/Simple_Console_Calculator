import java.util.Scanner;                               // Подключаем библиотеку.

public class Simple_Console_Calculator {                // Создаем основной класс программы.
    public static void main (String[] args) {           // Создаем запускающую программу функцию.
        Scanner sc = new Scanner(System.in);            // Создаем объект считывающий ввод.
        double num1;                                    // Создаем первую числовую переменную.
        double num2;                                    // Создаем вторую числовую переменную.
        double result;                                  // Создаем переменную, хранящую результат.
        char x;                                         // Создаем переменную, хранящую символы.

        System.out.print("Введите первое число: ");     // Просим ввести пользователя первое число.
        num1 = sc.nextDouble();                         // Считываем первое число.
        System.out.print("Введите второе число: ");     // Просим ввести пользователя второе число.
        num2 = sc.nextDouble();                         // Считываем второе число.

        System.out.print("Выберите (+,-,*,/): ");       // Просим выбрать необходимый оператор.
        x = sc.next().charAt(0);                        // Считываем оператор.

        switch (x) {                                    // Запускаем цикл-функцию.
            case '+': result = num1 + num2;             // Если +, положить в переменную result сложение num1 и num2
                break;                                  // Остановить цикл, если операция произошла.
            case '-': result = num1 - num2;
                break;
            case '*': result = num1 * num2;
                break;
            case '/': result = num1 / num2;
                break;
            default:
                System.out.print("Ошибка! Вы вели некорректный знак");  // Если введен неверный оператор, уведомляем.
                return;                                                 // Возвращаем в main итог программы.
        }

        System.out.println(num1 + " " + x + " " + num2 + " = " + result);   // Выводим результат.

    }
}
