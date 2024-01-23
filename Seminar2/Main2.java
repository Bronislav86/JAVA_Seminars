package Seminar2;
/*Напишите метод, который сжимает строку.
Пример: вход aaaabbbcdd.
Результат: a4b3cd2
 */
public class Main2 {
    public static void main(String[] args) {
        String str = "aaaabbbcdd";
        System.out.println(zip(str));
    }
    static String zip(String s){
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i - 1)){
                count++;
            }
            else{
                result.append(s.charAt(i - 1));
                if(count > 1){
                    result.append(count);
                }
                count = 1;
            }            
        }
        result.append(s.charAt(s.length() - 1));
        if(count > 1){
            result.append(count);
        }
        return result.toString();
    }
}
