package Seminar3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;


/*
Заполнить список десятью случайными числами. 
Отсортировать список методом sort() и вывести его на экран. 
 */
public class Main1 {
        

    public static void main(String[] args) {
        

        ArrayList<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
        list.add(random.nextInt(1,20));
        } 
        System.out.println(list);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }
}
