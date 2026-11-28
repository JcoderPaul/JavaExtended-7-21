- [Class `LinkedHashMap<K,V>`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashMap.html)

---
### Класс LinkedHashMap 
```
java.lang.Object
  java.util.AbstractMap<K,V>
    java.util.HashMap<K,V>
      java.util.LinkedHashMap<K,V>
```
**Типовые параметры:**
- **K** - тип ключей, используемых в этой карте
- **V** - тип отображаемых значений

**Все реализованные интерфейсы:** [Serializable](https://docs.oracle.com/javase/8/docs/api/java/io/Serializable.html), [Cloneable](https://docs.oracle.com/javase/8/docs/api/java/lang/Cloneable.html), [`Map<K,V>`](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html)

```java
public class LinkedHashMap<K,V>
          extends HashMap<K,V>
              implements Map<K,V>
```

Реализация интерфейса Map с использованием хеш-таблицы и связанного списка, обеспечивающая предсказуемый порядок итерации. Эта реализация отличается от 
HashMap тем, что поддерживает двусвязный список, проходящий через все её элементы. Этот связанный список определяет порядок итерации, который обычно 
соответствует порядку вставки ключей в Map-у ( insertion-order ). Обратите внимание, что порядок вставки не изменяется, если ключ повторно вставляется 
в Map-у. 

(Ключ `k` повторно вставляется в Map-у `m`, если вызывается `m.put(k, v)`, тогда как `m.containsKey(k)` вернул бы `true` непосредственно перед вызовом.)

Данная реализация избавляет своих клиентов от неопределенного, как правило, хаотичного порядка, обеспечиваемого 
[HashMap](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html)(и [Hashtable](https://docs.oracle.com/javase/8/docs/api/java/util/Hashtable.html)), 
без дополнительных затрат, связанных с [TreeMap](https://docs.oracle.com/javase/8/docs/api/java/util/TreeMap.html). Ее можно использовать для создания копии 
Map-ы, имеющей тот же порядок, что и оригинал, независимо от реализации исходной Map-ы:

```java
     void foo(Map m) {
         Map copy = new LinkedHashMap(m);
         ...
     }
```

Эта технология особенно полезна, если модуль принимает на вход Map-у, копирует её, а затем возвращает результаты, порядок которых определяется порядком элементов 
в копии. (Клиенты, как правило, ценят, когда результаты возвращаются в том же порядке, в котором они были представлены.) 

Предоставляется специальный [constructor](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashMap.html#LinkedHashMap-int-float-boolean-) для создания 
связанной хеш-Map-ы, порядок итерации которой определяется порядком последнего обращения к ее элементам, от наименее недавно использованных до наиболее недавно 
использованных (порядок доступа). Такая карта хорошо подходит для построения LRU-кэшей. Вызов методов put, putIfAbsent, get, getOrDefault, compute, computeIfAbsent, 
computeIfPresent, или merge приводит к доступу к соответствующей записи (при условии, что она существует после завершения вызова). Методы replace приводят к доступу 
к записи только в том случае, если значение заменено. Метод putAll генерирует один доступ к записи для каждого отображения в указанной карте в порядке, в котором 
отображения ключ-значение предоставляются итератором набора записей указанной карты. Никакие другие методы не генерируют доступ к записям. В частности, операции 
над представлениями коллекций не влияют на порядок итерации базовой карты.

Метод [removeEldestEntry(Map.Entry)](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashMap.html#removeEldestEntry-java.util.Map.Entry-) можно переопределить, 
чтобы установить политику автоматического удаления устаревших сопоставлений при добавлении новых сопоставлений к Map-е.

Этот класс предоставляет все необязательные операции Map и допускает нулевые элементы. Как и HashMap, он обеспечивает производительность за постоянное время для 
основных операций (добавление, включение и удаление ), при условии, что хеш-функция правильно распределяет элементы по корзинам. Производительность, вероятно, будет 
лишь немного ниже, чем у HashMap, из-за дополнительных затрат на поддержание связанного списка, за одним исключением: итерация по представлениям коллекций LinkedHashMap 
требует времени, пропорционального размеру Map-ы, независимо от ее емкости. Итерация по HashMap, вероятно, будет более затратной, требуя времени, пропорционального 
ее емкости .

Связанная хеш-Map-а имеет два параметра, влияющих на ее производительность: initial capacity - начальную емкость и load factor - коэффициент загрузки. Они определяются 
точно так же, как и для HashMap. Однако следует отметить, что "штраф" за выбор чрезмерно высокого значения начальной емкости для этого класса менее существенен, чем 
для HashMap, поскольку время итерации для этого класса не зависит от емкости.

**Обратите внимание, что данная реализация не синхронизирована.** Если несколько потоков одновременно обращаются к связанной хеш-Map-е, и хотя бы один из потоков вносит 
структурные изменения в Map-у, необходимо выполнить внешнюю синхронизацию. Обычно это достигается путем синхронизации с некоторым объектом, который естественным образом 
инкапсулирует Map-у. Если такого объекта не существует, Map-у следует «обернуть» с помощью соответствующего [Collections.synchronizedMap](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#synchronizedMap-java.util.Map-) метода. Лучше всего это делать во время создания Map-ы, чтобы 
предотвратить случайный несинхронизированный доступ к ней:

```java
   Map m = Collections.synchronizedMap(new LinkedHashMap(...));
```

Структурная модификация — это любая операция, которая добавляет или удаляет одно или несколько отображений или, в случае связанных хеш-Map с упорядоченным доступом, 
влияет на порядок итерации. В связанных хеш-Map-ах с упорядоченным вставкой простое изменение значения, связанного с ключом, который уже содержится в Map-е, не является 
структурной модификацией. В связанных хеш-Map-ах с упорядоченным доступом простое обращение к Map-e с помощью команды `get` является структурной модификацией.

Итераторы, возвращаемые методом iterator коллекций, возвращаемых всеми методами представления коллекций этого класса, являются быстродействующими (fail-fast): если 
структура Map-ы изменяется в любое время после создания итератора, любым способом, кроме как через собственный метод remove итератора, итератор выбросит исключение 
[ConcurrentModificationException](https://docs.oracle.com/javase/8/docs/api/java/util/ConcurrentModificationException.html). Таким образом, при одновременном изменении 
итератор быстро и корректно завершает работу, а не рискует столкнуться с произвольным, недетерминированным поведением в неопределенный момент в будущем.

Следует отметить, что быстрое реагирование итератора на ошибки не может быть гарантировано, поскольку, как правило, невозможно дать какие-либо строгие гарантии при 
наличии несинхронизированных одновременных изменений. Итераторы с быстрым реагированием на ошибки генерируют исключение [ConcurrentModificationException](https://docs.oracle.com/javase/8/docs/api/java/util/ConcurrentModificationException.html) в меру своих возможностей. Поэтому было бы неправильно писать программу, 
корректность которой зависит от этого исключения: быстрое реагирование итераторов на ошибки следует использовать только для обнаружения ошибок.

Метод spliterator, возвращаемый коллекциями, возвращаемыми всеми методами представления коллекций этого класса, имеет свойства [late-binding](https://docs.oracle.com/javase/8/docs/api/java/util/Spliterator.html#binding), fail-fast и дополнительно сообщает об ошибке [Spliterator.ORDERED](https://docs.oracle.com/javase/8/docs/api/java/util/Spliterator.html#ORDERED).

Этот класс является частью [Java Collections Framework](https://docs.oracle.com/javase/8/docs/technotes/guides/collections/index.html).

**Примечание по реализации:**
Итераторы-разделители, возвращаемые методом spliterator коллекций, возвращаемых всеми методами представления коллекций этого класса, создаются из итераторов 
соответствующих коллекций.

**См. также:** [Object.hashCode()](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#hashCode--), [Collection](https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html), [Map](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html), [HashMap](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html), [TreeMap](https://docs.oracle.com/javase/8/docs/api/java/util/TreeMap.html), [Hashtable](https://docs.oracle.com/javase/8/docs/api/java/util/Hashtable.html), [Serialized Form](https://docs.oracle.com/javase/8/docs/api/serialized-form.html#java.util.LinkedHashMap)

Можно создать LinkedHashMap, который возвращает элементы в том порядке, в котором они были в последний раз.

**Конструкторы:**
- `LinkedHashMap()` - Этот конструктор создает стандартную ссылку LinkedHashMap.
- `LinkedHashMap(Map m)` - Этот конструктор инициализирует LinkedHashMap с элементами из данного класса Map m.
- `LinkedHashMap(int capacity)` - Этот конструктор инициализирует LinkedHashMap с заданной емкостью.
- `LinkedHashMap(int capacity, float fillRatio)` - Этот конструктор инициализирует как емкость, так и коэффициент заполнения. Значение емкости и коэффициент заполнения такие же, как для HashMap.
- `LinkedHashMap(int capacity, float fillRatio, boolean Order)` - Этот конструктор позволяет указать, будут ли элементы храниться в связанном списке по порядку вставки или по порядку последнего доступа.
Если Order = true, используется порядок доступа. Если Order = false, используется порядок вставки.

**Методы** помимо, унаследованных от его родительских классов, LinkedHashMap имеет следующие методы:
- `void clear()` - Удаляет все отображения из этого Map.
- `boolean containsKey(Object key)` - Возвращает true, если этот Map отображает один и более ключей в указанное значение.
- `Object get(Object key)` - Возвращает значение, на которое эта карта отображает указанный ключ.
- `protected boolean removeEldestEntry(Map.Entry eldest)` - Возвращает true, если эта карта должна удалить свою старшую запись.

---
**Доп. материалы:**
- [`Class LinkedHashMap<K,V>` **(from ORACLE)**](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/LinkedHashMap.html)
- [A Guide to LinkedHashMap in Java **(from baeldung.com)**](https://www.baeldung.com/java-linked-hashmap)
- [LinkedHashMap in Java **(from geeksforgeeks.org)**](https://www.geeksforgeeks.org/java/linkedhashmap-class-in-java/)
- [LinkedHashMap in Java](https://beginnersbook.com/2013/12/linkedhashmap-in-java/)
- [Java LinkedHashMap: Insertion Order, Access Order and LRU Cache](https://howtodoinjava.com/java/collections/linkedhashmap/)
- [Java LinkedHashMap **(from w3schools.com)**](https://www.w3schools.com/java/java_linkedhashmap.asp)
- [LinkedHashMap in Java **(from dev.to)**](https://dev.to/sudhakar_v_c404997aeec839/linkedhashmap-in-java-2eb5)
- [Java LinkedHashMap](https://www.javaguides.net/2018/06/guide-to-linkedhashmap-class.html)
- [Структуры данных в картинках. LinkedHashMap **(from habr.com)**](https://habr.com/ru/articles/129037/)
- [Чем отличается поведение и особенности HashMap от LinkedHashMap в Java? **(from sobes.tech)**](https://sobes.tech/bank/android/bc382dbe-c8b9-44ad-ac78-0c0984bc5219)
- [В чем разница между HashMap vs LinkedHashMap vs TreeMap в Java **(from javarush.com)**](https://javarush.com/groups/posts/68640-v-chem-raznica-mezhdu-hashmap-vs-linkedhashmap-vs-treemap-v-java)
