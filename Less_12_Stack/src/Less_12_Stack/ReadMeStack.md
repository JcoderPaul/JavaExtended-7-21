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
**Все реализованные интерфейсы:**
- [Serializable](https://docs.oracle.com/javase/8/docs/api/java/io/Serializable.html),
- [Cloneable](https://docs.oracle.com/javase/8/docs/api/java/lang/Cloneable.html),
- [Iterable<E>](https://docs.oracle.com/javase/8/docs/api/java/lang/Iterable.html),
- [Collection<E>](https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html),
- [List<E>](https://docs.oracle.com/javase/8/docs/api/java/util/List.html),
- [RandomAccess](https://docs.oracle.com/javase/8/docs/api/java/util/RandomAccess.html)

```
public class Stack<E>
  extends Vector<E>
```

Это подкласс Vector, который реализует стандартный стек last-in-first-out (LIFO). Stack только определяет 
стандартный конструктор, который создает пустой стек `Stack()`. Stack включает все методы, определённые в 
[Vector](https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html), и самостоятельно добавляет 
несколько своих собственных.

Кроме методов, унаследованных от его родительского [класса Vector](../../../Less_11_Vector/ReadMeVector.md), Stack определяет следующие методы:

- `boolean empty()` - Проверяет, является ли стек пустым. Возвращает true, если стек пустой. Возвращает false, если стек содержит элементы.
- `Object peek()` - Возвращает элемент, находящийся в верхней части стэка, но не удаляет его.
- `Object pop()` - Возвращает элемент, находящийся в верхней части стэка, удаляя его в процессе.
- `Object push(Object element)` - Вталкивает элемент в стек. Элемент также возвращается.
- `int search(Object element)` - Ищет элемент в стеке. Если найден, возвращается его смещение от вершины стека. В противном случае возвращается 1.
