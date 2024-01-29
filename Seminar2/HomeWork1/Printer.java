package Seminar2.HomeWork1;

import java.util.Arrays;

class Answer {  
    public StringBuilder answer(String QUERY, String PARAMS){
        // Напишите свое решение ниже
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(QUERY);

        String[] partQuery = PARAMS.split(",");
        for (int i = 0; i < partQuery.length; i++) {
            if (!partQuery[i].contains("null")){
                String part = partQuery[i];
                part = part.replaceAll("[{}\"]", "");
                String[] partPart = part.split(":");
                System.out.println(part);
                stringBuilder.append(partPart[0]);
                stringBuilder.append("=");
                if (!partPart[1].matches("[0-9]*")){
                    stringBuilder.append("'");
                    stringBuilder.append(partPart[1]);
                    stringBuilder.append("'");
                } else {
                    stringBuilder.append(partPart[1]);
                }

                stringBuilder.append(" and");
            }
        }
        stringBuilder.delete(stringBuilder.length() - 4, stringBuilder.length());

        return stringBuilder;
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
	    PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"null\", \"age\":\"19\"} ";
      }
      else{
        QUERY = args[0];
        PARAMS = args[1];
      }     
      
      Answer ans = new Answer();      
      System.out.println(ans.answer(QUERY, PARAMS));
	}
}