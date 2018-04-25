package main.java;
import java.text.DecimalFormat;
import java.util.Scanner;
import static java.lang.System.*;

/**
 * Простой калькулятор с 4 базовыми операциями
 * Поиск самого длинного слова в массиве
 * @author Nikita Blokhin
 */
public class Calculator {
    /**
     * @param first Первое число
     * @param second Второе число
     * @param ask Операция выражения
     * @return Результат
     */
    private static String calculation(double first, double second, String ask){
        /* Форматирование результата*/
        DecimalFormat df = new DecimalFormat("#.####");
        String message = "";
        switch (ask) {
            case "+":
                message+=("Sum is: ");
                message+=(df.format(first+second));
                break;
            case "-":
                message+=("Subtract is: ");
                message+=(df.format(first+second));
                break;
            case "*":
                message+=("Multiply is: ");
                message+=(df.format(first*second));
                break;
            case "/":
                message+=("Divine is: ");
                message+=(df.format(first/second));
                break;
            default:
                message+=("Wrong operation");

        }
        return message;
    }

    /**
     * @param arr Список слов
     * @return Максимально длинное слово
     */
    private static String findmax(String[] arr){
        /* Объявление максимального слова как первого элемента массива*/
        String maxWord = arr[0];
        /* Поиск максимального слова методом перебора*/
        for (int i=1; i<=(arr.length-1); i++){
            if (maxWord.length() < arr[i].length()){
                maxWord = arr[i];
            }
        }
        //    out.println(Arrays.asList(arr));
        return ("The longest word in list is: " + maxWord);

    }

    /**
     * @param args
     */
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        out.println("Choose number of task: (1 - calculator, 2 - string array)");
        int task = scanner.nextInt();
        /* Выбор номера задания*/
        switch (task){
            /* Калькулятор*/
            case 1:
                out.println("Input first number:");
                double first = scanner.nextDouble();
                out.println("Input second number:");
                double second = scanner.nextDouble();
                out.println("Choose operation '+' '-' '*' '/'");
                String ask = scanner.next();
                out.println(calculation(first,second,ask));
                break;
            /* Поиск максимального слова*/
            case 2:
                out.println("Input size of array");
                int size = scanner.nextInt();
                String[] arr = new String[size];
                /* Присваивание элементам массива значений через ввод*/
                for (int i=0; i<=size-1; i++) {
                    out.println(i+1 +" of " +size + " word in list is");
                    arr[i] = scanner.next();
                }
                out.println(findmax(arr));
                break;
            default:
                err.println("Wrong number. Next time choose 1 or 2");
                }
        scanner.close();
        }

    }

