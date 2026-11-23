- [`Class Stack<E>` (form ORACLE DOCs)](https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html)

---
### Класс Stack (синхронизирован)

```
java.lang.Object
  java.util.AbstractCollection<E>
    java.util.AbstractList<E>
      java.util.Vector<E>
        java.util.Stack<E>
```
**Все реализованные интерфейсы:** [Serializable](https://docs.oracle.com/javase/8/docs/api/java/io/Serializable.html), [Cloneable](https://docs.oracle.com/javase/8/docs/api/java/lang/Cloneable.html), [Iterable<E>](https://docs.oracle.com/javase/8/docs/api/java/lang/Iterable.html), [Collection<E>](https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html), [List<E>](https://docs.oracle.com/javase/8/docs/api/java/util/List.html), [RandomAccess](https://docs.oracle.com/javase/8/docs/api/java/util/RandomAccess.html).

```
public class Stack<E>
  extends Vector<E>
```

Это подкласс Vector, который реализует стандартный стек last-in-first-out (LIFO). Stack только определяет 
стандартный конструктор, который создает пустой стек `Stack()`. Stack включает все методы, определённые в 
[Vector](https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html), и самостоятельно добавляет 
несколько своих собственных.

Кроме методов, унаследованных от его родительского [класса Vector](../../../Less_11_Vector/src/Less_11_Vector/ReadMeVector.md), Stack определяет следующие методы:

- `boolean empty()` - Проверяет, является ли стек пустым. Возвращает true, если стек пустой. Возвращает false, если стек содержит элементы.
- `Object peek()` - Возвращает элемент, находящийся в верхней части стэка, но не удаляет его.
- `Object pop()` - Возвращает элемент, находящийся в верхней части стэка, удаляя его в процессе.
- `Object push(Object element)` - Вталкивает элемент в стек. Элемент также возвращается.
- `int search(Object element)` - Ищет элемент в стеке. Если найден, возвращается его смещение от вершины стека. В противном случае возвращается 1.

При первом создании стек не содержит элементов.

Более полный и согласованный набор операций со стеком LIFO предоставляется [интерфейсом Deque](https://docs.oracle.com/javase/8/docs/api/java/util/Deque.html) 
и его реализациями, которые следует использовать вместо этого класса. Например:

```   
   Deque<Integer> stack = new ArrayDeque<Integer>();
```

---
**Доп. материалы:**
- [Stack Class in Java **(from geeksforgeeks.org)**](https://www.geeksforgeeks.org/java/stack-class-in-java/)
- [Quick Guide to the Java Stack **(from baeldung.com)**](https://www.baeldung.com/java-stack)
- [Java Stack: Class, Methods, Alternatives, and Implementation **(from happycoders.eu)**](https://www.happycoders.eu/algorithms/java-stack-class/)
- [Java Stack **(from jenkov.com)**](https://jenkov.com/tutorials/java-collections/stack.html)
- [Java Stack Class Example **(from javaguides.net)**](https://www.javaguides.net/2018/12/java-stack-class-example.html)
- [Java implementation for stack **(from stackoverflow.com)**](https://stackoverflow.com/questions/56827502/java-implementation-for-stack)
- [Simple implementation of Stack **(from gist.github.com)**](https://gist.github.com/sschakraborty/1b919e104bee4bb89fbaebc25b4c59a0)

---
- [Stack Class in Java with Methods & Examples](https://www.naukri.com/code360/library/stack-class-in-java)
- [Java Stack](https://codegym.cc/groups/posts/java-stack)
- [Stack Class in Java with Example](https://www.javastudypoint.com/2019/03/stack-class-in-java.html)
- [Java - The Stack Class](https://www.tutorialspoint.com/java/java_stack_class.htm)
- [What is Stack Class in Java and how to use it?](https://www.edureka.co/blog/stack-class-in-java/)
- [Класс Stack в Java](https://ru.stackoverflow.com/questions/669975/%D0%9A%D0%BB%D0%B0%D1%81%D1%81-stack-%D0%B2-java)
- [Структуры данных в Java — стек и очередь](https://javarush.com/groups/posts/2321-strukturih-dannihkh--stek-i-ocheredjh)
