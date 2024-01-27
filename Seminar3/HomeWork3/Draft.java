package Seminar3.HomeWork3;

import java.util.*;


public interface Draft {
    int[] arr = new int[] {6, 7, 5, 4, 3, 1, 2};
    
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (Integer item : arr) arrayList.add(item);
        arrayList.sort(Comparator.naturalOrder());
        
        int minValue = arrayList.getFirst();
        for (Integer item : arrayList) {
            if (item < minValue) {
                minValue = item;
            }         
        }

        int maxValue = arrayList.getFirst();
        for (Integer item : arrayList) {
            if (item > maxValue) {
                maxValue = item;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println();
        System.out.println(arrayList);
        System.out.println("Maximum is " + maxValue);
        System.out.println("Manimum is " + minValue);
    
    }
}
