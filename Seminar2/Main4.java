package Seminar2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main4 {
    static Logger logger = Logger.getAnonymousLogger();
    public static void main(String[] args) {
        String s = "test";
        String filePath = "D:/БрониДоки/Обучение 1С Разработчик/Block2/Java знакомство и как пользоваться базовым API/Seminars/Seminar2/test.txt";
        String logPath = "D:/БрониДоки/Обучение 1С Разработчик/Block2/Java знакомство и как пользоваться базовым API/Seminars/Seminar2/log.xml";
        int n = 10;

        createLogger(logPath);

        String s1 = repeat(s, n);
        writeToFile(s1, filePath);
        System.out.println("Конец программы");

        closeLogger();
    }

    static void createLogger(String logPath){
        try {
            FileHandler fh = new FileHandler(logPath, true);
            SimpleFormatter simpleFormatter = new SimpleFormatter();
            fh.setFormatter(simpleFormatter);
            logger.addHandler(fh);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void closeLogger(){
        Handler[] handlers = logger.getHandlers();
        for (Handler handler : handlers) {
            handler.close();
        }
    }

    static void writeToFile(String s, String filePath) {      
        try (FileWriter fileWriter = new FileWriter(filePath, true)){
            fileWriter.write(s);
            fileWriter.write("\n");
            logger.info("Запись в файл произведена успешно");
        } catch (IOException e) {
            logger.warning("Не удалось записать текст в файл");
            e.printStackTrace();
        }        
    }

    static String readFile(String filePath){
        StringBuilder stringBuilder = new StringBuilder();
        File file = new File(filePath);
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                stringBuilder.append(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    static String repeat(String s, int n){
        // return s.repeat(n); // тоже самое только короче

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(s);
            sb.append(" ");
        }
        return sb.toString();
    }
}
