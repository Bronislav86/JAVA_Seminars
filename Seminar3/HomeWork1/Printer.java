package Seminar3.HomeWork1;

import java.util.ArrayList;
import java.util.Arrays;

class MergeSort {

    public int[] mergeSort(int[] a) {
        // Напишите свое решение ниже

		if (a.length > 1) 
		{
			int[] firstHalf = new int[a.length / 2];
			System.arraycopy(a, 0, firstHalf, 0, a.length / 2);
			mergeSort(firstHalf);

			int[] secondHalf = new int[a.length - a.length / 2];
			System.arraycopy(a, a.length / 2, secondHalf, 0, a.length - a.length / 2);
			mergeSort(secondHalf);

			merge(firstHalf, secondHalf, a);
		}
        return a;
	}

	public static void merge(int[] list1, int[] list2, int[] temp) 
	{
		int current1 = 0;
		int current2 = 0;
		int current3 = 0;

		while (current1 < list1.length && current2 < list2.length) 
		{
			if (list1[current1] < list2[current2])
				temp[current3++] = list1[current1++];
			else
				temp[current3++] = list2[current2++];
		}

		while (current1 < list1.length)
			temp[current3++] = list1[current1++];

		while (current2 < list2.length)
			temp[current3++] = list2[current2++];
	}
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
    public static void main(String[] args) { 
        int[] a;

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{5, 1, 6, 2, 3, 4};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        MergeSort answer = new MergeSort();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }
}