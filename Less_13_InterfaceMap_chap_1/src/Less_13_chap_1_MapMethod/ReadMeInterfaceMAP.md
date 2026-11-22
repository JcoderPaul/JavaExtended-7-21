- [`Interface Map<K,V>`](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html)

---
### Интерфейс Map 

Отображает уникальные ключи для значений. Ключ – это объект, который используется, чтобы позже получить значение.

**Пакет:** [java.util])(https://docs.oracle.com/javase/8/docs/api/java/util/package-summary.html)

**Типовые параметры:**
- `K` - тип ключей, используемых в этой Map-e (карте);
- `V` - тип отображаемых значений;

**Все известные субинтерфейсы:** [`Bindings`](https://docs.oracle.com/javase/8/docs/api/javax/script/Bindings.html), [`ConcurrentMap <K,V>`](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ConcurrentMap.html), [`ConcurrentNavigableMap <K,V>`](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ConcurrentNavigableMap.html), [`LogicalMessageContext`](https://docs.oracle.com/javase/8/docs/api/javax/xml/ws/handler/LogicalMessageContext.html), [`MessageContext`](https://docs.oracle.com/javase/8/docs/api/javax/xml/ws/handler/MessageContext.html), [`NavigableMap <K,V>`](https://docs.oracle.com/javase/8/docs/api/java/util/NavigableMap.html), [`SOAPMessageContext`](https://docs.oracle.com/javase/8/docs/api/javax/xml/ws/handler/soap/SOAPMessageContext.html) , [`SortedMap <K,V>`])(https://docs.oracle.com/javase/8/docs/api/java/util/SortedMap.html)

**Все известные реализующие классы:** [AbstractMap](https://docs.oracle.com/javase/8/docs/api/java/util/AbstractMap.html), [Attributes](https://docs.oracle.com/javase/8/docs/api/java/util/jar/Attributes.html), [AuthProvider](https://docs.oracle.com/javase/8/docs/api/java/security/AuthProvider.html), [ConcurrentHashMap](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ConcurrentHashMap.html), [ConcurrentSkipListMap](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ConcurrentSkipListMap.html), [EnumMap](https://docs.oracle.com/javase/8/docs/api/java/util/EnumMap.html), [HashMap](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html), [Hashtable](https://docs.oracle.com/javase/8/docs/api/java/util/Hashtable.html), [IdentityHashMap](https://docs.oracle.com/javase/8/docs/api/java/util/IdentityHashMap.html), [LinkedHashMap](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashMap.html), [PrinterStateReasons](https://docs.oracle.com/javase/8/docs/api/javax/print/attribute/standard/PrinterStateReasons.html), [Properties](https://docs.oracle.com/javase/8/docs/api/java/util/Properties.html), [Provider](https://docs.oracle.com/javase/8/docs/api/java/security/Provider.html), [RenderingHints](https://docs.oracle.com/javase/8/docs/api/java/awt/RenderingHints.html), [SimpleBindings](https://docs.oracle.com/javase/8/docs/api/javax/script/SimpleBindings.html), [TabularDataSupport](https://docs.oracle.com/javase/8/docs/api/javax/management/openmbean/TabularDataSupport.html), [TreeMap](https://docs.oracle.com/javase/8/docs/api/java/util/TreeMap.html), [UIDefaults](https://docs.oracle.com/javase/8/docs/api/javax/swing/UIDefaults.html), [WeakHashMap](https://docs.oracle.com/javase/8/docs/api/java/util/WeakHashMap.html),

Имея ключ и значение, можно поместить значение в объект Map. После помещения значения,
мы можем его получить, используя его ключ.
Некоторые методы генерируют исключение NoSuchElementException, когда в вызываемой карте нет элементов.
Исключение ClassCastException генерируется, когда объект несовместим с элементами на карте.
Исключение NullPointerException генерируется, когда совершается попытка использовать нулевой объект,
а ноль не допустим на карте (однако либо ключ, либо значение могут быть NULL).
Исключение UnsupportedOperationException генерируется, когда совершается попытка изменить неизменяемую карту.

Метод и описание
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
