package HomeWork2;

import java.util.Random;

class Answer {

    public void printPrimeNums(){
      // Напишите свое решение ниже
      int[] prime_nums = new int[Convert.ToInt32.Random(1001)];
      for(int i = 2; i <= 1000; i++){
        if (i == 2){
          prime_nums[i] = i;
        }
        else if (i == 3){
          System.out.println(i);
        }
        else if (i % 2 != 0 & i % 3 != 0 & i % 4 != 0 & i % 5 !=0 & i % 6 !=0 & i % 7 !=0 & i % 8 !=0 & i % 9 !=0 & i % i == 0 & i / i == 1){
          System.out.println(i);
        }
      }
    }
  
  }
  
  
  // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
  public class Printer{ 
      public static void main(String[] args) { 
        
        Answer ans = new Answer();      
        ans.printPrimeNums();
      }
  }