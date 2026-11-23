- [`Interface Map.Entry<K,V>`](https://docs.oracle.com/javase/8/docs/api/java/util/Map.Entry.html)

---
### `Interface Map.Entry<K,V>`

**Все известные реализующие классы:** [AbstractMap.SimpleEntry](https://docs.oracle.com/javase/8/docs/api/java/util/AbstractMap.SimpleEntry.html), [AbstractMap.SimpleImmutableEntry](https://docs.oracle.com/javase/8/docs/api/java/util/AbstractMap.SimpleImmutableEntry.html)

**Внешний интерфейс:** [Map < K , V >](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html)

Объект представления Map (пара "ключ-значение"). [Метод Map.entrySet](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html#entrySet--) 
возвращает представление коллекции Map-ы, элементы которой принадлежат этому классу. Единственный способ получить ссылку на объект Map-ы — это 
использовать итератор этого представления коллекции. Эти объекты Map.Entry действительны только в течение итерации; более формально, поведение 
объекта Map-ы не определено, если базовая Map-а была изменена после того, как итератор вернул объект, за исключением операции 
[setValue](https://docs.oracle.com/javase/8/docs/api/java/util/Map.Entry.html#setValue-V-)? которая заменяет значение, соответствующее данной 
записи, на указанное значение над объектом Map-ы.

Повторим, пройтись по всем значениям в Map в цикле можно при помощи Map.Entry. Проход по каждой паре "ключ-значение" — самая базовая, основная 
процедура прохода по Map-e. В Java, каждая пара хранится в поле Map называемом Map.Entry. [Map.entrySet()](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html#entrySet--) - 
возвращает набор ключ-значений, потому самым эффективным способом пройтись по всем значениям Map-ы будет перебор в цикле по примеру:

```java
  for(Entry entry: Map.entrySet()) {
    K key = entry.getKey();   //получить ключ
    V value = entry.getValue();   //получить значение
  }
```

Так же мы можем использовать Iterator, особенно в версиях младше JDK 1.5, например так:

```java
  Iterator itr = Map.entrySet().iterator();
  while(itr.hasNext()) {
    Entry entry = itr.next();
    K key = entry.getKey();   //получить ключ
    V value = entry.getValue();   //получить значение
  }
```

---
**Доп. материалы:**
- [`Interface Map.Entry<K,V>` **(from java.net)**](https://download.java.net/java/early_access/valhalla/docs/api/java.base/java/util/Map.Entry.html)
- [Difference Between value() vs entrySet() Method in Java Map **(from geeksforgeeks.org)**](https://www.geeksforgeeks.org/java/difference-between-value-vs-entryset-method-in-java-map/)
- [How to Iterate Any Map in Java? **(from geeksforgeeks.org)**](https://www.geeksforgeeks.org/java/iterate-map-java/)
- [How to Create a New Entry in a Map **(from baeldung.com)**](https://www.baeldung.com/java-map-new-entry)
- [Difference Between Map.ofEntries() and Map.of() **(from baeldung.com)**](https://www.baeldung.com/map-ofentries-and-map-of)
- [Using the Map.Entry Java Class **(from baeldung.com)**](https://www.baeldung.com/java-map-entry)
- [Java Map – keySet() vs. entrySet() vs. values() Methods **(from baeldung.com)**](https://www.baeldung.com/java-map-entries-methods)
- [Map.Entry Interface in Java **(from beginnersbook.com)**](https://beginnersbook.com/2014/06/map-entry-interface-in-java/)
- [Map in Java](https://iq.opengenus.org/map-java/#gsc.tab=0)
- [Uses of Interface java.util.Map.Entry](https://docs.oracle.com/javase/8/docs/api/java/util/class-use/Map.Entry.html)
