- [`Class HashMap<K,V>`](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html)
- [Class Object](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html)

---
В примере [Less_13_Map_Step8](./Less_13_Map_Step8.java) приведены три класса у которых методы
[hashCode](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#hashCode--) и 
[equals](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#equals-java.lang.Object-) 
перезаписаны оба, либо только по одному, что при работе с коллекциями типа [HashMap](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html) 
дает весьма любопытный результат.

**!!! Совет всегда перезаписывать самостоятельно методы hashCode и Equals для своих классов !!!**

---
- [Interface `Map.Entry<K,V>`](./ReadMeAboutFOREACH.md)
- [Interface `Map<K,V>`](./ReadMeAboutMap.md)

---
**Доп. материалы:**
- [Контракты equals и hashCode](https://javarush.com/groups/posts/1989)
- [Методы equals & hashCode: практика использования](https://javarush.com/groups/posts/2179-metodih-equals--hashcode-praktika-ispoljhzovanija)
- [Java equals() and hashCode() Contracts](https://www.baeldung.com/java-equals-hashcode-contracts)
- [Методы equals() и hashcode() в языке Java](https://tproger.ru/articles/equals-hashcode-java)
- [Equals and HashCode Contract](https://javatrainingschool.com/equals-and-hashcode-contract/)
- [Java Interview: Understanding the equals() and hashCode() Contract in Java](https://medium.com/@alxkm/understanding-the-equals-and-hashcode-contract-in-java-79237fe0639e)

--- 
**Авторы статей с Medium**
- [Alex Klimenko](https://medium.com/@alxkm)
- [Oleksandr Klymenko GitHub](https://github.com/alxkm)
