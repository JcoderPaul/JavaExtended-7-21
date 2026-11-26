### Interface SortedMap

- [`Interface SortedMap<K,V>`](https://docs.oracle.com/javase/8/docs/api/java/util/SortedMap.html)

```
public interface SortedMap<K,V>
  extends Map<K,V>
```

**Типовые параметры:**
- **K** - тип ключей, используемых в этой Map-e
- **V** - тип отображаемых значений

**Все суперинтерфейсы:** [`Map <K,V>`](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html)

**Все известные субинтерфейсы:** [`ConcurrentNavigableMap <K,V>`](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ConcurrentNavigableMap.html), [`NavigableMap <K,V>`](https://docs.oracle.com/javase/8/docs/api/java/util/NavigableMap.html)

**Все известные реализующие классы:** [ConcurrentSkipListMap](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ConcurrentSkipListMap.html), [TreeMap](https://docs.oracle.com/javase/8/docs/api/java/util/TreeMap.html)

Интерфейс SortedMap расширяет Map и создает отображение, в котором все элементы отсортированы в
порядке возрастания их ключей. SortedMap имеет ряд отличительных методов:
- `SortedMap<K, V> headMap(K end)`: возвращает отображение SortedMap, которые содержит все элементы оригинального SortedMap вплоть до элемента с ключом end;
- `SortedMap<K, V> tailMap(K start)`: возвращает отображение SortedMap, которые содержит все элементы оригинального SortedMap, начиная с элемента с ключом start;
- `SortedMap<K, V> subMap(K start, K end)`: возвращает отображение SortedMap, которые содержит все элементы оригинального SortedMap вплоть от элемента с ключом start до элемента с ключом end;

---
**Доп. материалы:**
- [SortedMap Interface in Java](https://www.geeksforgeeks.org/java/sortedmap-java-examples/)
- [Java SortedMap](https://jenkov.com/tutorials/java-collections/sortedmap.html)
- [How to use SortedMap interface or TreeMap in Java?](https://stackoverflow.com/questions/7427758/how-to-use-sortedmap-interface-or-treemap-in-java)
- [Keeping Keys Sorted with SortedMap and NavigableMap](https://dev.java/learn/api/collections-and-streams/collections-framework/sorted-maps/)
- [Java SortedMap Tutorial with Examples](https://o7planning.org/13455/java-sortedmap)
- [Uses of Interface java.util.SortedMap](https://download.java.net/java/early_access/valhalla/docs/api/java.base/java/util/class-use/SortedMap.html)
- [Что такое SortedMap](https://youngjunior.ru/java/interviews/36087)
- [Интерфейс SortedMap](https://proglang.su/java/sortedmap-interface)

---
### Interface NavigableMap

- [`Interface NavigableMap<K,V>`](https://docs.oracle.com/javase/8/docs/api/java/util/NavigableMap.html)

```
public interface NavigableMap<K,V> 
  extends SortedMap <K,V>
```

**Типовые параметры:**
- **K** - тип ключей, используемых в этой карте
- **V** - тип отображаемых значений

**Все суперинтерфейсы:** [`Map<K,V>`](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html), [`SortedMap<K,V>`](https://docs.oracle.com/javase/8/docs/api/java/util/SortedMap.html)

**Все известные субинтерфейсы:** [`ConcurrentNavigableMap <K,V>`](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ConcurrentNavigableMap.html)

**Все известные реализующие классы:** [ConcurrentSkipListMap](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ConcurrentSkipListMap.html), [TreeMap](https://docs.oracle.com/javase/8/docs/api/java/util/TreeMap.html)

Интерфейс NavigableMap расширяет интерфейс SortedMap и обеспечивает возможность получения элементов
отображения относительно других элементов. Его основные методы:

- `Map.Entry<K, V> ceilingEntry(K obj)` - возвращает элемент с наименьшим ключом k, который больше или равен ключу obj (k >=obj). Если такого ключа нет, то возвращается null.
- `Map.Entry<K, V> floorEntry(K obj)` - возвращает элемент с наибольшим ключом k, который меньше или равен ключу obj (k <=obj). Если такого ключа нет, то возвращается null.
- `Map.Entry<K, V> higherEntry()` - возвращает элемент с наименьшим ключом k, который больше ключа obj (k >obj). Если такого ключа нет, то возвращается null.
- `Map.Entry<K, V> lowerEntry()` - возвращает элемент с наибольшим ключом k, который меньше ключа obj (k <obj). Если такого ключа нет, то возвращается null.
- `Map.Entry<K, V> firstEntry()` - возвращает первый элемент отображения.
- `Map.Entry<K, V> lastEntry()` - возвращает последний элемент отображения.
- `Map.Entry<K, V> pollFirstEntry()` - возвращает и одновременно удаляет первый элемент из отображения.
- `Map.Entry<K, V> pollLastEntry()` - возвращает и одновременно удаляет последний элемент из отображения.
- `K ceilingKey(K obj)` - возвращает наименьший ключ k, который больше или равен ключу obj (k >=obj). Если такого ключа нет, то возвращается null.
- `K floorKey(K obj)` - возвращает наибольший ключ k, который меньше или равен ключу obj (k <=obj). Если такого ключа нет, то возвращается null.
- `K lowerKey(K obj)` - возвращает наибольший ключ k, который меньше ключа obj (k <obj). Если такого ключа нет, то возвращается null.
- `K higherKey(K obj)` - возвращает наименьший ключ k, который больше ключа obj (k >obj). Если такого ключа нет, то возвращается null.
- `NavigableSet<K> descendingKeySet()` - возвращает объект NavigableSet, который содержит все ключи отображения в обратном порядке.
- `NavigableMap<K, V> descendingMap()` - возвращает отображение NavigableMap, которое содержит все элементы в обратном порядке.
- `NavigableSet<K> navigableKeySet()` - возвращает объект NavigableSet, который содержит все ключи отображения.
- `NavigableMap<K, V> headMap(K upperBound, boolean incl)` - возвращает отображение NavigableMap, которое содержит все элементы оригинального NavigableMap вплоть от элемента с ключом upperBound. Параметр incl
при значении true указывает, что элемент с ключом upperBound также включается в выходной набор.
- `NavigableMap<K, V> tailMap(K lowerBound, boolean incl)` - возвращает отображение NavigableMap, которое содержит все элементы оригинального NavigableMap, начиная с элемента с ключом lowerBound. Параметр incl
при значении true указывает, что элемент с ключом lowerBound также включается в выходной набор.
- `NavigableMap<K, V> subMap(K lowerBound, boolean lowIncl, K upperBound, boolean highIncl)` - возвращает отображение NavigableMap, которое содержит все элементы оригинального NavigableMap от элемента с ключом
lowerBound до элемента с ключом upperBound. Параметры lowIncl и highIncl при значении true включают в выходной набор элементы с ключами lowerBound и upperBound соответственно.

---
**Доп. материалы:**
- [NavigableMap Interface in Java](https://www.geeksforgeeks.org/java/navigablemap-interface-in-java-with-example/)
- [Java NavigableMap Interface](https://www.programiz.com/java-programming/navigablemap)
- [TreeMap, SortedMap and NavigableMap in Java](https://www.examclouds.com/java/java-core/java-treemap-navigablemap)
- [Java NavigableMap](https://jenkov.com/tutorials/java-collections/navigablemap.html)
- [NavigableMap vs SortedMap in Java](https://www.javaguides.net/2023/11/navigablemap-vs-sortedmap-in-java.html)
- [Java NavigableMap Tutorial with Examples](https://o7planning.org/13447/java-navigablemap)
- [NavigableMap in Java](https://www.scientecheasy.com/2021/01/navigablemap-in-java.html/)
- [What is NavigableMap in Java ? TreeMap, headMap, tailMap, and subMap Examples](https://javarevisited.blogspot.com/2013/01/what-is-navigablemap-in-java-6-example-submap-head-tail.html)
- [Интерфейсы SortedMap и NavigableMap. Класс TreeMap](https://webhamster.ru/mytetrashare/index/mtb426/1572572010qd0btbeilg)
- [Особенности TreeMap в Java](https://javarush.com/groups/posts/2584-osobennosti-treemap)


****************************************** TreeMap ******************************************

Класс TreeMap<K, V> представляет отображение в виде дерева. Он наследуется от класса AbstractMap и
реализует интерфейс NavigableMap, а следовательно, также и интерфейс SortedMap. Поэтому в отличие от
коллекции HashMap в TreeMap все объекты автоматически сортируются по возрастанию их ключей.

Класс TreeMap имеет следующие конструкторы:

TreeMap(): создает пустое отображение в виде дерева

TreeMap(Map<? extends K, ? extends V> 'map'): создает дерево, в которое добавляет все
элементы из отображения 'map'

TreeMap(SortedMap<K, ? extends V> 'smap'): создает дерево, в которое добавляет все элементы
из отображения 'smap'

TreeMap(Comparator<? super K> comparator): создает пустое дерево, где все добавляемые элементы
впоследствии будут отсортированы компаратором.

---
**Collection tutorial by Aditya Harendra Mall:**
- [Core Java Series — Collections — Introduction — part1](https://medium.com/@adityaharendramall/core-java-series-collections-introduction-part1-7c047cc9f2b6)
- [Core Java Series — Collections — Collection and List Interface — part2](https://medium.com/@adityaharendramall/core-java-series-collections-collection-and-list-interface-part2-67ab7a826ef2)
- [Core Java Series — Collections — Cursors,Enumeration, Iterator, ListIterator — part3](https://medium.com/@adityaharendramall/core-java-series-collections-cursors-enumeration-iterator-listiterator-part3-dbee2815a1cf)
- [Core Java Series — Collections — Set Interface — part4](https://medium.com/@adityaharendramall/core-java-series-collections-set-interface-part4-83a025c22e17)
- [Core Java Series — Collections — Comparable and Comparator interface — part5](https://medium.com/@adityaharendramall/core-java-series-collections-comparable-and-comparator-interface-part5-001ba7652ff6)
- [Core Java Series — Collections — Map interface, HashMap — part6](https://medium.com/@adityaharendramall/core-java-series-collections-map-interface-hashmap-part6-405977317f9a)
- [Core Java Series — Collections — LinkedHashMap — part7](https://medium.com/@adityaharendramall/core-java-series-collections-linkedhashmap-part7-9d799125d979)
- [Core Java Series — Collections — IdentityHashMap — part8](https://medium.com/@adityaharendramall/core-java-series-collections-identityhashmap-part8-eba8fb77c182)
- [Core Java Series — Collections — WeakHashMap — part9](https://medium.com/@adityaharendramall/core-java-series-collections-weakhashmap-part9-a245eeab572b)
- [Core Java Series — Collections — SortedMap Interface, TreeMap — part10](https://medium.com/@adityaharendramall/core-java-series-collections-sortedmap-interface-treemap-part10-6de3d347f2da)
- [Core Java Series — Collections — HashTable, Properties — part11](https://medium.com/@adityaharendramall/core-java-series-collections-hashtable-properties-part11-d82b4f4c81a7)
- [Core Java Series — Collections — Queue interface — part12](https://medium.com/@adityaharendramall/core-java-series-collections-queue-interface-part12-6daf9b6612b1)
- [Core Java Series — Collections — Concurrent Collection — Introduction, Fail-fast & Fail-safe Iterators, ConcurrentModificationException — part14](https://medium.com/@adityaharendramall/core-java-series-collections-concurrent-collection-introduction-fail-fast-fail-safe-df60507b77f2)
- [Core Java Series — Collections — Concurrent Collection — ConcurrentMap Interface, ConcurrentHashMap Class - part15](https://medium.com/@adityaharendramall/core-java-series-collections-concurrent-collection-concurrentmap-interface-f48b62fbe748)
- [Core Java Series — Collections — Concurrent Collection - CopyOnWriteArrayList — Class - part16](https://medium.com/@adityaharendramall/core-java-series-collections-concurrent-collection-copyonwritearraylist-class-part16-2ded2bc1bb54)
- [Core Java Series — Collections — Concurrent Collection - CopyOnWriteArraySet — Class - part17](https://medium.com/@adityaharendramall/core-java-series-collections-concurrent-collection-copyonwritearrayset-class-part17-32a45763a534)

---
**Авторы на Medium:**
- [Aditya Harendra Mall](https://medium.com/@adityaharendramall)
