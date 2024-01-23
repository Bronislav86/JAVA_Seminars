package Seminar2;
/*
Напишите метод, который принимает на вход строку (String) и определяет
является ли строка палиндромом (возвращает boolean значение).
 */
public class Main3 {
    public static void main(String[] args) {
        String s = "А роза упала на лапу Азора";
        System.out.println(isPolindrom(s));
        System.out.println(isPolindromV2(s));
    }
    public static boolean isPolindrom(String str){
        str = str.toLowerCase();
        str = str.replace(" ", "");
        for (int i = 0; i < str.length() / 2; i++) {
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
    public static boolean isPolindromV2(String str){
        str = str.toLowerCase();
        str = str.replace(" ", "");
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        // System.out.format("Ответ будет: " + stringBuilder.toString().equals(str));
        // System.out.println();
        return stringBuilder.toString().equals(str);
    }
}
