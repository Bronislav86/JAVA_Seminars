package Seminar2.HomeWork1;

import java.util.Arrays;

class Answer {  
    public static StringBuilder answer(String QUERY, String PARAMS){
        // Напишите свое решение ниже
        StringBuilder str1 = new StringBuilder(QUERY);


        // PARAMS = PARAMS.replace("\"", "");
        PARAMS = PARAMS.replace("{", "");
        PARAMS = PARAMS.replace("}", "'");
        PARAMS = PARAMS.replace(",", "' and");
        PARAMS = PARAMS.replace(":", "='");
        String[] splitedParams = PARAMS.split("\"");
        System.out.println(Arrays.toString(splitedParams));

        StringBuilder str2 = new StringBuilder(PARAMS);
        StringBuilder ans = new StringBuilder();
        ans.append(str1);
        ans.append(str2);
        return ans;
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
	public static void main(String[] args) { 
      String QUERY = "";
      String PARAMS = "";
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        QUERY = "select * from students where ";
	    PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
      }
      else{
        QUERY = args[0];
        PARAMS = args[1];
      }     
      
      Answer str1 = new Answer();      
      System.out.println(str1.answer(QUERY, PARAMS));
	}
}