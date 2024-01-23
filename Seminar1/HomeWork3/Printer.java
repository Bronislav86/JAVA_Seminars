package HomeWork3;

class Calculator {
    public double calculate(char op, int a, int b) {
      // Введите свое решение ниже
      double result = 0;
        if (op != '+' & op != '-' & op != '*' & op != '/'){
            System.out.println("Некорректный оператор");
        }

        if (op == '+'){
            result = (a + b);
        }
        else if (op == '-'){
            result = a - b;
        }
        else if (op == '*'){
            result = a * b;
        }
        else{
            result = a / b;
        }
    
    return result;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
    public static void main(String[] args) { 
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '*';
            b = 7;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        Calculator calculator = new Calculator();
        double result = calculator.calculate(op, a, b);
        System.out.println(result);
    }
}
