- [`Class HashMap<K,V>`](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html)
- [Class Object](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html)

---
В примере [Less_13_Map_Step8](./Less_13_Map_Step8.java) приведены три класса у которых методы
[hashCode](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#hashCode--) и 
[equals](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#equals-java.lang.Object-) 
перезаписаны оба, либо только по одному, что при работе с коллекциями типа [HashMap](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html) 
дает весьма любопытный результат.

**!!! Совет всегда перезаписывать самостоятельно методы hashCode и Equals для своих классов !!!**
