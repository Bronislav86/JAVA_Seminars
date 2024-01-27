package Seminar3.HomeWork3;

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

class Answer {
    public void analyzeNumbers(Integer[] arr) {
      // Введите свое решение ниже
      ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(arr));
        Collections.sort(arrayList); // сортировка списка по возрастанию
        System.out.println(arrayList); // вывод списка на экран
        System.out.println("Minimum is " + arrayList.get(0)); // нахождение минимального значения в списке и вывод на экран
        System.out.println("Maximum is " + arrayList.get(arrayList.size()-1)); // нахождение максимального значения в списке и вывод на экран

      int sum = 0;
      for (Integer item : arrayList) {
        sum += item;
      }

      System.out.println("Average is = " + (double) sum / arrayList.size());
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
    public static void main(String[] args) { 
      Integer[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new Integer[]{-2, -1, 0, 1, 2, 3, 4, 5};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
      }     
      
      Answer ans = new Answer();      
      ans.analyzeNumbers(arr);
    }
}
