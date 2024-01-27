package Seminar3;

import java.util.ArrayList;
import java.util.List;
import javax.swing.text.html.HTMLDocument.Iterator;

/*
 Создать список типа ArrayList
Поместить в него как строки, так и целые числа. 
Пройти по списку, найти и удалить целые числа.
 */
public class Main2 {
    public static void main(String[] args) {

        List<Object> list = new ArrayList<>();

        list.add(123);
        list.add(999);
        list.add("строка");
        list.add(null);
        list.add(852);
        list.add(3.14);

        // for (int i = 0; i < list.size(); i++) {
        //     if (list.get(i) instanceof Integer){
        //         list.remove(i--);
        //     }
        // }

        Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()){
            if (iterator.next() instanceof Integer){
                iterator.remove();
            }
        }

        System.out.println(list);

    }
}
