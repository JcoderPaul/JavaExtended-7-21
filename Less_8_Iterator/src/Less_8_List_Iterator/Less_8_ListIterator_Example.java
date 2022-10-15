package Less_8_List_Iterator;

import java.util.*;

/*
Определяем палиндром ли слово, простой и немного не правильный, но это пример
работы ListIterator работающего в обе стороны при итерации списка.

Пример палиндрома:
довод
доход
заказ
кабак
казак
комок
потоп
радар
шабаш
шалаш
*/
public class Less_8_ListIterator_Example {
    public static void main(String[] args) {
        String str_for_check = "шалашик";
        System.out.println("Наше слово: " + str_for_check);
        System.out.println("----------------------------------------------------");
        List<Character> test_list = new ArrayList<>();
        int i = 0;
        for (char ch: str_for_check.toCharArray()) {
            test_list.add(ch);
            System.out.println(i + " - ый "+"элемент листа -> " + ch);
            i += 1;
        }
        System.out.println("----------------------------------------------------");
        isPalindrome(str_for_check);

    }

    static void isPalindrome(String str_for_check){
        List<Character> check_for_palindrome_list = new ArrayList<>();
        for (char ch: str_for_check.toCharArray()) {
            check_for_palindrome_list.add(ch);
        }
        // Применили метод listIterator без аргументов, предполагаем движение по списку вперед
        ListIterator<Character> forward_iter = check_for_palindrome_list.listIterator();
        // Применили метод listIterator с аргументом, это размер списка, т.е. мы планируем двигаться назад
        ListIterator<Character> revers_iter = check_for_palindrome_list.listIterator(check_for_palindrome_list.size());

        boolean str_palindrome = true;
        while (forward_iter.hasNext() && revers_iter.hasPrevious()){
            char ch_f = forward_iter.next();
            char ch_b = revers_iter.previous();
            System.out.println(ch_f + " <-> " + ch_b);
            if(ch_f != ch_b){
                str_palindrome = false;
                break;
            }
        }
        if (str_palindrome){
            System.out.println("Слово '" + str_for_check + "' палиндром!");
        } else {
            System.out.println("Слово '" + str_for_check + "' совсем не палиндром!");
        }
    }
}
