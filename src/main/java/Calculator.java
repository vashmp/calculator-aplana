package main.java;
import java.text.DecimalFormat;
import java.util.Scanner;
import static java.lang.System.*;

/**
 * Простой калькулятор с 4 базовыми операциями
 * @author Nikita Blokhin
 */
public class Calculator {
    /**
     * @param args
     */
    public static void main(String[] args){
        /** Форматирование результата*/
        DecimalFormat df = new DecimalFormat("#.####");
        Scanner scanner = new Scanner(System.in);

        out.println("Input first number:");
        /** Первая переменная выражения*/
        double first = scanner.nextDouble();
        out.println("Input second number:");
        /** Вторая переменная выражения*/
        double second = scanner.nextDouble();

        out.println("Choose operation '+' '-' '*' '/'");
        /** Выбор операции выражения*/
        String ask = scanner.next();

        switch (ask) {
            case "+":
                out.print("Sum is: ");
                out.println(df.format(first+second));
                break;
            case "-":
                out.print("Subtract is: ");
                out.print(df.format(first+second));
                break;
            case "*":
                out.print("Multiply is: ");
                out.print(df.format(first*second));
                break;
            case "/":
                out.print("Divine is: ");
                out.print(df.format(first/second));
                break;
            default:
                err.println("Wrong operation");

        }
        scanner.close();
    }

}
