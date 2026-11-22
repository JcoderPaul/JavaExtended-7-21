- [`Interface Map<K,V>`](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html)

---
### Интерфейс Map 

Отображает уникальные ключи для значений. Ключ – это объект, который используется, чтобы позже получить значение.

**Пакет:** [java.util])(https://docs.oracle.com/javase/8/docs/api/java/util/package-summary.html)

**Типовые параметры:**
- `K` - тип ключей, используемых в этой Map-e (карте);
- `V` - тип отображаемых значений;

**Все известные субинтерфейсы:** [`Bindings`](https://docs.oracle.com/javase/8/docs/api/javax/script/Bindings.html), [`ConcurrentMap <K,V>`](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ConcurrentMap.html), [`ConcurrentNavigableMap <K,V>`](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ConcurrentNavigableMap.html), [`LogicalMessageContext`](https://docs.oracle.com/javase/8/docs/api/javax/xml/ws/handler/LogicalMessageContext.html), [`MessageContext`](https://docs.oracle.com/javase/8/docs/api/javax/xml/ws/handler/MessageContext.html), [`NavigableMap <K,V>`](https://docs.oracle.com/javase/8/docs/api/java/util/NavigableMap.html), [`SOAPMessageContext`](https://docs.oracle.com/javase/8/docs/api/javax/xml/ws/handler/soap/SOAPMessageContext.html) , [`SortedMap <K,V>`](https://docs.oracle.com/javase/8/docs/api/java/util/SortedMap.html)

**Все известные реализующие классы:** [AbstractMap](https://docs.oracle.com/javase/8/docs/api/java/util/AbstractMap.html), [Attributes](https://docs.oracle.com/javase/8/docs/api/java/util/jar/Attributes.html), [AuthProvider](https://docs.oracle.com/javase/8/docs/api/java/security/AuthProvider.html), [ConcurrentHashMap](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ConcurrentHashMap.html), [ConcurrentSkipListMap](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ConcurrentSkipListMap.html), [EnumMap](https://docs.oracle.com/javase/8/docs/api/java/util/EnumMap.html), [HashMap](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html), [Hashtable](https://docs.oracle.com/javase/8/docs/api/java/util/Hashtable.html), [IdentityHashMap](https://docs.oracle.com/javase/8/docs/api/java/util/IdentityHashMap.html), [LinkedHashMap](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashMap.html), [PrinterStateReasons](https://docs.oracle.com/javase/8/docs/api/javax/print/attribute/standard/PrinterStateReasons.html), [Properties](https://docs.oracle.com/javase/8/docs/api/java/util/Properties.html), [Provider](https://docs.oracle.com/javase/8/docs/api/java/security/Provider.html), [RenderingHints](https://docs.oracle.com/javase/8/docs/api/java/awt/RenderingHints.html), [SimpleBindings](https://docs.oracle.com/javase/8/docs/api/javax/script/SimpleBindings.html), [TabularDataSupport](https://docs.oracle.com/javase/8/docs/api/javax/management/openmbean/TabularDataSupport.html), [TreeMap](https://docs.oracle.com/javase/8/docs/api/java/util/TreeMap.html), [UIDefaults](https://docs.oracle.com/javase/8/docs/api/javax/swing/UIDefaults.html), [WeakHashMap](https://docs.oracle.com/javase/8/docs/api/java/util/WeakHashMap.html),

```
  public interface Map<K,V>
```

Объект, сопоставляющий ключи со значениями. Map-а не может содержать повторяющиеся ключи; каждый ключ может соответствовать не более чем одному значению.
Этот интерфейс заменяет [класс Dictionary](https://docs.oracle.com/javase/8/docs/api/java/util/Dictionary.html), который был полностью абстрактным классом, 
а не интерфейсом.

Интерфейс Map предоставляет три представления коллекций, которые позволяют отображать содержимое Map-ы как набор ключей, коллекцию значений или набор 
сопоставлений ключ-значение. Порядок элементов в Map-е определяется порядком, в котором итераторы в представлениях коллекций Map-ы возвращают свои элементы. 
Некоторые реализации Map (карт), например [класс TreeMap](https://docs.oracle.com/javase/8/docs/api/java/util/TreeMap.html), гарантируют определенный порядок; 
другие, например [класс HashMap](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html), этого не делают.

**Примечание:** следует проявлять особую осторожность при использовании изменяемых объектов в качестве ключей Map-ы. Поведение Map-ы (карты) не определено, 
если значение объекта изменяется таким образом, что это влияет на сравнения и на равенство, когда объект является ключом в Map-е. Особым случаем этого запрета 
является то, что Map-а не может содержать саму себя в качестве ключа. Хотя Map-а может содержать саму себя в качестве значения, следует проявлять крайнюю 
осторожность: методы [equals](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#equals-java.lang.Object-) и [hashCode](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#hashCode--) больше не являются корректно определенными для такой Map-ы.

Все классы, реализующие Map-ы общего назначения, должны предоставлять два «стандартных» конструктора: конструктор void (без аргументов), создающий пустую Map-у, 
и конструктор с одним аргументом типа Map, создающий новую Map-у (карту) с теми же сопоставлениями ключ-значение, что и его аргумент. По сути, последний 
конструктор позволяет пользователю копировать любую Map-у, создавая эквивалентную Map-у нужного класса. Нет способа принудительно выполнить эту рекомендацию 
(поскольку интерфейсы не могут содержать конструкторы), но все реализации Map (карт) общего назначения в JDK ей соответствуют.

«Деструктивные» методы, содержащиеся в этом интерфейсе, то есть методы, изменяющие Map-у, с которой они работают, настроены на генерацию исключения [UnsupportedOperationException](https://docs.oracle.com/javase/8/docs/api/java/lang/UnsupportedOperationException.html), если эта Map-а не поддерживает данную операцию. В этом случае эти методы 
могут, но не обязаны, генерировать исключение [UnsupportedOperationException](https://docs.oracle.com/javase/8/docs/api/java/lang/UnsupportedOperationException.html), 
если вызов не окажет никакого влияния на Map-у. Например, вызов [putAll(Map) метода](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html#putAll-java.util.Map-) 
на неизменяемой Map-е может, но не обязан, генерировать исключение, если Map-а, отображения которой должны быть «наложены», пуста.

Некоторые реализации Map имеют ограничения на ключи и значения, которые они могут содержать. Например, некоторые реализации запрещают ключи и значения со значением 
null, а другие имеют ограничения на типы своих ключей. Попытка вставить недопустимый ключ или значение вызывает неконтролируемое исключение, обычно [NullPointerException](https://docs.oracle.com/javase/8/docs/api/java/lang/NullPointerException.html) или [ClassCastException](https://docs.oracle.com/javase/8/docs/api/java/lang/ClassCastException.html). 
Попытка проверить наличие недопустимого ключа или значения может вызвать исключение или просто вернуть false; некоторые реализации будут демонстрировать первое поведение, 
а некоторые — второе. В более общем случае, попытка операции над недопустимым ключом или значением, завершение которой не приведет к вставке недопустимого элемента в Map, 
может вызвать исключение или же завершиться успешно, по выбору реализации. Такие исключения помечены как «необязательные» в спецификации этого интерфейса.

Многие методы в интерфейсах [Collections Framework](https://docs.oracle.com/javase/8/docs/technotes/guides/collections/overview.html) определены [через equals метод](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#equals-java.lang.Object-). Например, спецификация метода [containsKey(Object key)](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html#containsKey-java.lang.Object-) гласит: «возвращает true тогда и только тогда, когда эта Map-а содержит 
отображение для ключа `k` такое, что (key==null ? k==null : key.equals(k)) ». Эту спецификацию не следует понимать как подразумевающую, что вызов Map.containsKey с 
ненулевым аргументом key приведет к вызову key.equals(k) для любого ключа k . Реализации могут свободно использовать оптимизации, позволяющие избежать вызова метода 
equals , например, путем предварительного сравнения хеш-кодов двух ключей. (Спецификация [Object.hashCode()](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#hashCode--) 
гарантирует, что два объекта с неравными хеш-кодами не могут быть равны.) В более общем случае, реализации различных интерфейсов Collections Framework могут свободно 
использовать указанное поведение базовых Objectметодов там, где разработчик сочтет это целесообразным.

Некоторые операции с картой, выполняющие рекурсивный обход карты, могут завершиться ошибкой в ​​случае самореферентных экземпляров, когда карта прямо или косвенно содержит 
саму себя. К ним относятся методы clone(), equals(), hashCode()и toString(). Реализации могут опционально обрабатывать сценарий самореферентности, однако большинство 
современных реализаций этого не делают.

Этот интерфейс является частью [Java Collections Framework](https://docs.oracle.com/javase/8/docs/technotes/guides/collections/index.html).

---
**Метод и описание:**
-> void clear() - Удаляет все пары ключей/значений в вызываемой карте.

-> boolean containsKey(Object k) - Возвращает true, если вызываемая карта содержит k как ключ.
В противном случае, возвращает false.

-> boolean containsValue(Object v) - Возвращает true, если карта содержит v как значение.
В противном случае, возвращает false.

-> Set entrySet() - Возвращает набор, содержащий записи на карте. Набор содержит объекты типа Map.Entry.
Этот метод обеспечивает просмотр набора вызывающей карты.

-> boolean equals(Object obj) - Возвращает true, если obj является Map и содержит одинаковые записи.
В противном случае, возвращает false.

-> Object get(Object k) - Возвращает значение, связанное с ключом k.

-> int hashCode() - Возвращает хэш-код для вызываемой карты.

-> boolean isEmpty() - Возвращает true, если вызываемая карта пустая. В противном случае, возвращает false.

-> Set keySet() - Возвращает набор, который содержит ключи в вызываемой карте. Этот метод предоставляет
набор ключей на вызывающей карте.

-> Object put(Object k, Object v) - Вставляет запись в вызываемую карту, перезаписывая любое предыдущее
значение, связанное с ключом. Ключ и значения соответствуют k и v. Возвращает ноль, если ключ ещё не
существует. В противном случае возвращается предыдущее значение, связанное с ключом.

-> void putAll(Map m) - Вставляет все записи из m в эту карту.

-> Object remove(Object k) - Удаляет запись, чей ключ равен k.

-> int size() - Возвращает количество пар ключей/значений в карте.

-> Collection values() - Возвращает коллекцию значений в карте. Этот метод предоставляет просмотр
значений в карте.
