import java.util.Arrays;

public class Main4 {

    // Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке

    public static void main(String[] args) {
        String s = "Welcome пожаловать на курс по Java";
        String[] arr_s = s.split(" "); //
        System.out.println(Arrays.toString(arr_s));
        String new_s = "";

        for (int i = arr_s.length-1; i < 0; i++) {
            new_s += arr_s[i] + " ";
        }
        System.out.println(new_s.trim());
    }




}