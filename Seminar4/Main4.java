package Seminar4;
/*
1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
 */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main4 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
       // printAsStack(arr);
        printAsQueue(arr);

    }

    static void printAsQueue(Integer[] arr){
        Queue<Integer> queue = new LinkedList<>();
        queue.addAll(Arrays.asList(arr));

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

    static void printAsStack (Integer[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(arr));

        // System.out.println(stack); // некорректный вывод стэка - в прямом порядке потому что наследуется метод toString
        // for (Integer a : stack) { // тоже не подходит - тоже самое
            
        // }

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}
