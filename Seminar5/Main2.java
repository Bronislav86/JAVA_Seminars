package Seminar5;
/*
Написать программу, определяющую правильность расстановки скобок в выражении.
Пример 1: a+(d*3) - истина
Пример 2: [a+(1*3) - ложь
Пример 3: [a+(1]*3) - ложь
Пример 4: [6+(3*3)] - истина
Пример 5: {a}[+]{(d*3)} - истина
Пример 6: <{a}+{(d*3)}> - истина
Пример 7: {a+]}{(d*3)} - ложь

Решается через Stack!
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main2 {
    public static void main(String[] args) {
        /*Написать программу, определяющую правильность расстановки скобок в выражении.
        Пример 1: a+(d*3) - истина
        Пример 2: [a+(1*3) - ложь
        Пример 3: [a+(1]*3) - ложь
        Пример 4: [6+(3*3)] - истина
        Пример 5: {a}[+]{(d*3)} - истина
        Пример 6: <{a}+{(d*3)}> - истина
        Пример 7: {a+]}{(d*3)} - ложь */
        System.out.println(checkBrackets("a+(d*3)"));
        System.out.println(checkBrackets("[6+(3*3)]"));
        System.out.println(checkBrackets("{a}[+]{(d*3)}"));
        System.out.println(checkBrackets("<{a}+{(d*3)}>"));
        System.out.println(checkBrackets("a+(d*3))"));
        System.out.println(checkBrackets("[a+(1*3)"));
        System.out.println(checkBrackets("[a+(1]*3)"));
        System.out.println(checkBrackets("{a+]}{(d*3)}"));

    }
    public static boolean checkBrackets(String str)
    {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        map.put('<', '>');
        for (Character s : str.toCharArray())
        {
            if (map.containsKey(s))
            {
                stack.add(s);
            }
            else if (map.containsValue(s))
            {
                
                if (stack.empty() || map.get(stack.pop()) != s)
                {
                    return false;
                }
            }
        }  
        return stack.empty();
    }

}

