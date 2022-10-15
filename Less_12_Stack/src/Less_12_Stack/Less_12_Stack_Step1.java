package Less_12_Stack;

import java.util.Stack;

public class Less_12_Stack_Step1 {
    public static void main(String[] args) {
        Stack<String> str_stack = new Stack<>();
        // Добавления в стек
        str_stack.push("AK-47");
        str_stack.push("AR-15");
        str_stack.push("Glock 22");
        str_stack.push("АПС");
        str_stack.push("Гюрза");
        str_stack.push("MK-5");
        // Печать стека
        System.out.println("Состояние стека -> " + str_stack);
        /*
        Метод *.peek() позволяет извлечь элемент из вершины стека не удаляя его и посмотреть
        */

        System.out.println("Верхний элемент стека -> " + str_stack.peek());
        System.out.println("Состояние стека -> " + str_stack);

        /*
        Извлечение и печать самого верхнего элемента стека, метод *.pop() извлекает и удаляет элемент.
        Применение метода *.pop() к пустому стеку выкинет ошибку - EmptyStackException.
        */
        System.out.println("Метод *.pop() смотрим верхушку и удаляем -> " + str_stack.pop());
        // Печать стека после извлечения верхнего элемента (последнего)
        System.out.println("Состояние стека -> " + str_stack);
        System.out.println("-------------- Работа *.isEmpty() и *.pop() в цикле --------------");
        // Существует метод проверяющий пустоту стека *.isEmpty() - true/false
        while (!str_stack.isEmpty()){
            System.out.println("Извлекли элемент -> " + str_stack.pop());
            System.out.println("Стек выглядит так -> " + str_stack);
        }



    }
}
