package Seminar4.HomeWork3;

import java.util.ArrayDeque;

class Calculator {
    ArrayDeque<Double> queue = new ArrayDeque<>();

  public double calculate(char op, int a, int b) {
        // Напишите свое решение ниже
        double res = 0;
        double temp = 0;
        switch (op) {
            case '+':
                res = a + b;
                queue.add(res); temp = queue.getLast();
                break;
            case '-':
                res = a - b;
                queue.add(res); temp = queue.getLast();
                break;
            case '*':
                res = a * b;
                queue.add(res); temp = queue.getLast();
                break;
            case '/':
                res = a / b;
                queue.add(res); temp = queue.getLast();
                break;
             case '<':
                temp = queue.element();
                break;
        default:
            throw new IllegalArgumentException("Некорректный оператор" + op);               
        }

        return temp;

    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        int a, b, c, d;
        char op, op2, undo;

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '*';
            b = 19;
            c = 70;
            op2 = '-';
            d = 4;
            undo = '<';
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
            c = Integer.parseInt(args[3]);
            op2 = args[4].charAt(0);
            d = Integer.parseInt(args[5]);
            undo = args[6].charAt(0);
        }

        Calculator calculator = new Calculator();
        double result = calculator.calculate(op, a, b);
        System.out.println(result);
        double result2 = calculator.calculate(op2, c, d);
        System.out.println(result2);
        double prevResult = calculator.calculate(undo, 0, 0);
        System.out.println(prevResult);
    }
}
