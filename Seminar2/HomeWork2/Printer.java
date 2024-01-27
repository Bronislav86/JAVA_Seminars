package Seminar2.HomeWork2;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;

class BubbleSort {
    private static File log;
    private static FileWriter fileWriter;
    String logPath = "D:/БрониДоки/Обучение 1С Разработчик/Block2/Java знакомство и как пользоваться базовым API/Seminars/Seminar2/HomeWork2/log.txt";

  static void logger(String logPath, int[] arr){
    Date currentDate = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("YYY-MM-dd hh:mm");
    String date = formatter.format(currentDate);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(date + " ");
    stringBuilder.append(arr);
    
    // try(FileWriter fileWriter = new FileWriter(logPath, true)){
    //   fileWriter.write(stringBuilder);
    //   fileWriter.write('\n');
    // } catch(IOException e){
    //     e.printStackTrace();
    // } 
    
  }
  
    public static void sort(int[] mas) {
      for (int i = 0; i < mas.length - 1; i++) {
        for(int j = 0; j < mas.length - i - 1; j++) {
            if(mas[j + 1] < mas[j]) {
                int temp = mas[j];
                mas[j] = mas[j + 1];
                mas[j + 1] = temp;
            }
        }
      }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
    public static void main(String[] args) { 
      int[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new int[]{9, 4, 8, 3, 1};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
      }     
      
      BubbleSort ans = new BubbleSort();      
      ans.sort(arr);

      try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
