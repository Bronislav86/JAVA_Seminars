package Seminar6;
/*
1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24. 
2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите
процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
Для вычисления процента используйте формулу:
процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        int count = 1000;
        int start = 0;
        int end = 24;

        System.out.println(Arrays.toString(fillArray(start, end, count)));
        System.out.println(percent(fillArray(start, end, count)));
    }

    static Integer[] fillArray (int start, int end, int count) {
        Integer[] arr = new Integer[count];
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            arr[i] = random.nextInt(start, end + 1);
        }
        return arr;
    }

    static double percent (Integer[] arr) {
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        //return (double)(set.size() * 100) / arr.length;
        return set.size() * 100. / arr.length;
    }
    
}
