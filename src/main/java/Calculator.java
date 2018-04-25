package main.java;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

/**
 * Простой калькулятор с 4 базовыми операциями
 * Поиск самого длинного слова в массиве
 * @author Nikita Blokhin
 */
public class Calculator {
    /**
     * @param args
     */
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        out.println("Choose number of task: (1 - calculator, 2 - string array)");
        int task = scanner.nextInt();
        /** Выбор номера задания*/
        switch (task){
            /** Калькулятор*/
            case 1:
                /** Форматирование результата*/
                DecimalFormat df = new DecimalFormat("#.####");
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
                 break;
            case 2:
                /** Поиск максимального слова*/
                out.println("Input size of array");
                /** Размер массива */
                int size = scanner.nextInt();
                String[] arr = new String[size];
                /** Присваивание элементам массива значений через ввод*/
                for (int i=0; i<=size-1; i++) {
                    out.println(i+1 +" of " +size + " word in list is");
                    arr[i] = scanner.next();
                }
                /** Объявление максимального слова как первого элемента массива*/
                String maxWord = arr[0];
                /** Поиск максимального слова методом перебора*/
                for (int i=1; i<=size-1; i++){
                    if (maxWord.length() < arr[i].length()){
                            maxWord = arr[i];
                    }
                }
            //    out.println(Arrays.asList(arr));
                out.println("The longest word in list is: " + maxWord);
                break;
            default:
                err.println("Wrong number. Next time choose 1 or 2");
                }
        scanner.close();
        }

    }

