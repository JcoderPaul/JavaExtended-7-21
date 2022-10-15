Пройтись по всем значениям в Map в цикле можно при помощи Map.Entry.
Проход по каждой паре ключ-значение — самая базовая, основная процедура прохода по Map.
В Java, каждая пара хранится в поле Map называемом Map.Entry.
Map.entrySet() - возвращает набор ключ-значений, потому самым эффективным способом пройтись
по всем значениям Map будет перебор в цикле по примеру:

for(Entry entry: Map.entrySet()) {
  K key = entry.getKey();   //получить ключ
  V value = entry.getValue();   //получить значение
}

Так же мы можем использовать Iterator, особенно в версиях младше JDK 1.5, например так:

Iterator itr = Map.entrySet().iterator();
while(itr.hasNext()) {
  Entry entry = itr.next();
  K key = entry.getKey();   //получить ключ
  V value = entry.getValue();   //получить значение
}