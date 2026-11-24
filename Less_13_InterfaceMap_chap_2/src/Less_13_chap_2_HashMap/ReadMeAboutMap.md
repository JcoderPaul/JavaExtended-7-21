- [`Interface Map<K,V>`](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html)

---
### Интерфейс Map 

**Пакет:** [java.util])(https://docs.oracle.com/javase/8/docs/api/java/util/package-summary.html)

**Типовые параметры:**
- `K` - тип ключей, используемых в этой Map-e (карте);
- `V` - тип отображаемых значений;

**Все известные субинтерфейсы:** [`Bindings`](https://docs.oracle.com/javase/8/docs/api/javax/script/Bindings.html), [`ConcurrentMap <K,V>`](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ConcurrentMap.html), [`ConcurrentNavigableMap <K,V>`](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ConcurrentNavigableMap.html), [`LogicalMessageContext`](https://docs.oracle.com/javase/8/docs/api/javax/xml/ws/handler/LogicalMessageContext.html), [`MessageContext`](https://docs.oracle.com/javase/8/docs/api/javax/xml/ws/handler/MessageContext.html), [`NavigableMap <K,V>`](https://docs.oracle.com/javase/8/docs/api/java/util/NavigableMap.html), [`SOAPMessageContext`](https://docs.oracle.com/javase/8/docs/api/javax/xml/ws/handler/soap/SOAPMessageContext.html) , [`SortedMap <K,V>`](https://docs.oracle.com/javase/8/docs/api/java/util/SortedMap.html)

**Все известные реализующие классы:** [AbstractMap](https://docs.oracle.com/javase/8/docs/api/java/util/AbstractMap.html), [Attributes](https://docs.oracle.com/javase/8/docs/api/java/util/jar/Attributes.html), [AuthProvider](https://docs.oracle.com/javase/8/docs/api/java/security/AuthProvider.html), [ConcurrentHashMap](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ConcurrentHashMap.html), [ConcurrentSkipListMap](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ConcurrentSkipListMap.html), [EnumMap](https://docs.oracle.com/javase/8/docs/api/java/util/EnumMap.html), [HashMap](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html), [Hashtable](https://docs.oracle.com/javase/8/docs/api/java/util/Hashtable.html), [IdentityHashMap](https://docs.oracle.com/javase/8/docs/api/java/util/IdentityHashMap.html), [LinkedHashMap](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashMap.html), [PrinterStateReasons](https://docs.oracle.com/javase/8/docs/api/javax/print/attribute/standard/PrinterStateReasons.html), [Properties](https://docs.oracle.com/javase/8/docs/api/java/util/Properties.html), [Provider](https://docs.oracle.com/javase/8/docs/api/java/security/Provider.html), [RenderingHints](https://docs.oracle.com/javase/8/docs/api/java/awt/RenderingHints.html), [SimpleBindings](https://docs.oracle.com/javase/8/docs/api/javax/script/SimpleBindings.html), [TabularDataSupport](https://docs.oracle.com/javase/8/docs/api/javax/management/openmbean/TabularDataSupport.html), [TreeMap](https://docs.oracle.com/javase/8/docs/api/java/util/TreeMap.html), [UIDefaults](https://docs.oracle.com/javase/8/docs/api/javax/swing/UIDefaults.html), [WeakHashMap](https://docs.oracle.com/javase/8/docs/api/java/util/WeakHashMap.html),

```
  public interface Map<K,V>
```

[Интерфейс `Map<K, V>`](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html) - отображение Map (карта) или иначе говоря словарь, 
где каждый элемент представляет пару "ключ-значение". При этом все ключи уникальные в рамках объекта Map. Такие коллекции облегчают поиск 
элемента, если нам известен ключ - уникальный идентификатор объекта.

Следует отметить, что в отличие от других интерфейсов, которые представляют коллекции, **интерфейс Map НЕ расширяет [интерфейс Collection](https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html)**.

**Среди методов интерфейса Map можно выделить следующие:**
- `void clear()` - очищает коллекцию;
- `boolean containsKey(Object k)` - возвращает true, если коллекция содержит ключ k;
- `boolean containsValue(Object v)` - возвращает true, если коллекция содержит значение v;
- `Set<Map.Entry<K, V>> entrySet()` - возвращает набор элементов коллекции. Все элементы представляют объект Map.Entry;
- `boolean equals(Object obj)` - возвращает true, если коллекция идентична коллекции, передаваемой через параметр obj;
- `boolean isEmpty` - возвращает true, если коллекция пуста;
- `V get(Object k)` - возвращает значение объекта, ключ которого равен k. Если такого элемента не окажется, то возвращается значение null;
- `V getOrDefault(Object k, V defaultValue)` - возвращает значение объекта, ключ которого равен k. Если такого элемента не окажется, то возвращается значение defaultValue;
- `V put(K k, V v)` - помещает в коллекцию новый объект с ключом k и значением v. Если в коллекции уже есть объект с подобным ключом, то он перезаписывается. После добавления возвращает предыдущее значение для ключа k, если он уже был в коллекции. Если же ключа еще не было в коллекции, то возвращается значение null;
- `V putIfAbsent(K k, V v)` - помещает в коллекцию новый объект с ключом k и значением v, если в коллекции еще нет элемента с подобным ключом;
- `Set<K> keySet()` - возвращает набор всех ключей отображения;
- `Collection<V> values()` - возвращает набор всех значений отображения;
- `void putAll(Map<? extends K, ? extends V> map)` - добавляет в коллекцию все объекты из отображения map;
- `V remove(Object k)` - удаляет объект с ключом k;
- `int size()` - возвращает количество элементов коллекции;

Чтобы положить объект в коллекцию, используется [метод put](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html#put-K-V-), а чтобы 
получить по ключу - [метод get](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html#get-java.lang.Object-). Реализация интерфейса 
Map также позволяет получить наборы как ключей, так и значений. А метод [`entrySet()`](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html#entrySet--) 
возвращает набор всех элементов в виде объектов [`Map.Entry<K, V>`](https://docs.oracle.com/javase/8/docs/api/java/util/Map.Entry.html).

Обобщенный интерфейс [`Map.Entry<K, V>`](https://docs.oracle.com/javase/8/docs/api/java/util/Map.Entry.html) представляет объект с ключом 
типа `K` и значением типа `V` и определяет следующие методы:

- `boolean equals(Object obj)` - возвращает true, если объект obj, представляющий интерфейс Map.Entry, идентичен текущему;
- `K getKey()` - возвращает ключ объекта отображения;
- `V getValue()` - возвращает значение объекта отображения;
- `V setValue(V v)` - устанавливает для текущего объекта значение v;
- `int hashCode()` - возвращает хеш-код данного объекта;

При переборе объектов отображения мы будем оперировать этими методами для работы с ключами и значениями объектов.

---
**Обязательно к изучению:**
- [HashMap](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html);
- [TreeMap](https://docs.oracle.com/javase/8/docs/api/java/util/TreeMap.html);
- [Hashtable](https://docs.oracle.com/javase/8/docs/api/java/util/Hashtable.html);
- [SortedMap](https://docs.oracle.com/javase/8/docs/api/java/util/SortedMap.html);
- [Collection](https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html);
- [Set](https://docs.oracle.com/javase/8/docs/api/java/util/Set.html);

---
**Доп. материалы:**
- [`Interface Map<K,V>` **(from openjdk.org)**](https://cr.openjdk.org/~pminborg/panama/21/v1/javadoc/java.base/java/util/Map.html)
- [`Interface Map.Entry<K,V>` **(from openjdk.org)**](https://docs.oracle.com/javase/8/docs/api/java/util/Map.Entry.html)
- [Java Map **(from w3schools.com)**](https://www.w3schools.com/java/java_map.asp)
- [Map Interface in Java **(geeksforgeeks.org/)**](https://www.geeksforgeeks.org/java/map-interface-in-java/)
- [Map Interface in Java](https://codegym.cc/groups/posts/221-map-interface-and-its-implementations-java-hashmap-linkedhashmap-and-treemap-examples)
- [Unlocking the Power of the Map Interface in Java](https://medium.com/@pratik.941/unlocking-the-power-of-the-map-interface-in-java-6e1dcfd93b06)
- [Complete Guide to Map Interface in Java](https://www.upgrad.com/tutorials/software-engineering/java-tutorial/map-in-java/)
- [Java Map Interface](https://www.tpointtech.com/java-map)
- [Java - Map Interface](https://www.tutorialspoint.com/java/java_map_interface.htm)
- [Ответы на самые популярные вопросы об интерфейсе Map](https://javarush.com/groups/posts/2542-otvetih-na-samihe-populjarnihe-voprosih-ob-interfeyse-map)
- [Java Map **(from jenkov.com)**](https://jenkov.com/tutorials/java-collections/map.html)

---
**Авторы на Medium:**
- [Pratik T](https://medium.com/@pratik.941)
