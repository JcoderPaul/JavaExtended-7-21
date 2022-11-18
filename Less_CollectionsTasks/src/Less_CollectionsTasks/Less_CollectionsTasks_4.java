package Less_CollectionsTasks;

import java.util.*;

/*
--------------------------------------------------------------------
Теория:
Многочлен (или полином от греч. πολυ- «много» + лат. nomen «имя»)
В частности, многочлен от одной переменной есть конечная формальная
сумма вида: P(x) = c0 + c1*x^1 + c2*x^2 + ... + cn*x^n, где
n - значение степени и порядок коэффициентов (в нашем случае, ключ K);
^ - знак степени;
cn - n-ый фиксированный коэффициент (в нашем случае, значение V);
x - переменная.
--------------------------------------------------------------------
Задача:
Сложить два многочлена заданной степени, если коэффициенты
многочлена хранятся в объекте HashMap в виде:
Ключ: номер степени;
Значение: значение множителя;

Например:
Многочлен_1   Многочлен_2
K   V         K   V
0 - 3         0 - 5 -> 3 + 5 = 8
1 - 5         1 - 3 -> 5 + 3 = 8
2 - 4               -> 4 + 0 = 4
4 - 3         4 - 3 -> 3 + 3 = 6
6 - 1               -> 1 + 0 = 1
              7 - 2 -> 0 + 2 = 2

Результат (вывод на экран): 2x^7 + x^6 + 6x^4 + 4x^2 + 8x^1 + 8

Примечание: В даном примере не реализована проверка на знак '-'
т.е. на отрицательное значение коэффициента.
--------------------------------------------------------------------
*/
public class Less_CollectionsTasks_4 {
    public static void main(String[] args) {
        // Задаем коэффициенты и значение
        Map<Integer, Integer> polynom_1 =
                Map.of(
                0, 3,
                1, 5,
                2, 4,
                4, 3,
                6, 1
        );
        Map<Integer, Integer> polynom_2 =
                Map.of(
                        0, 5,
                        1, 3,
                        4, 3,
                        7, 2
                );
        Map<Integer, Integer> mapToView = sumPolynom(polynom_1, polynom_2);
        System.out.println(viewFinalPolinom(mapToView));
        System.out.println("----------------------------------------------");
        Map<Integer, Integer> mapToViewTwo = sumPolynomTwo(polynom_1, polynom_2);
        System.out.println(viewFinalPolinom(mapToViewTwo));
    }
    // Метод суммирует два полинома (многочлена)
    private static Map<Integer, Integer> sumPolynom(Map<Integer, Integer> poly_1,
                                                    Map<Integer, Integer> poly_2){
        /*
        Коллекция куда соберется сумма двух полиномов,
        в данном случае мы сразу заполнили результирующую
        коллекцию данными из первого полинома (как всегда,
        исходные данные мы не меняем).
        */
        Map<Integer, Integer> poly_res = new HashMap<>(poly_1);
        // Перебираем содержимое второго полинома
        for (Map.Entry<Integer, Integer> entry: poly_2.entrySet()) {
            /*
            Значения ключей в обоих Map-ах имитирующих полиномы
            должны идти от 0 и до .... n. По этому начинаем их
            перебирать и суммировать содержимое соответствующих
            ключей. Если значение под ключом нет, то возвращаем 0.

            Метод V getOrDefault(Object k, V defaultValue) - возвращает
            значение объекта, ключ которого равен k. Если такого элемента
            не окажется, то возвращается значение defaultValue - которое
            задаем мы.

            И так, если в обеих коллекциях под одинаковым ключом лежат
            значения, они суммируются, если в одной из коллекций значения
            нет, мы в сумму подставляем 0.
            */
            Integer volToPolyRes = poly_res.getOrDefault(entry.getKey(), 0);
            // Помещаем в результирующий Map, сумму значений под соответствующими ключами
            poly_res.put(entry.getKey(), volToPolyRes + entry.getValue());
        }
        // Возвращаем результат
        return poly_res;
    }
    // Метод выводящий на экран результат суммирования двух многочленов
    private static String viewFinalPolinom(Map<Integer, Integer> mapToString){
        /*
        Поскольку элементы TreeMap отсортированы в естественном
        порядке, т.е. от меньшего к большему, а нам нужен вывод:
        2x^7 + x^6 + 6x^4 + 4x^2 + 8x^1 + 8, т.е. в обратном от
        большего к меньшему, применяем Comparator.reverseOrder(),
        к результирующей коллекции.
        */
        Map<Integer, Integer> resMap = new TreeMap<>(Comparator.reverseOrder());
        // Помещаем все содержимое переданной из вне коллекции в результирующую
        resMap.putAll(mapToString);
        // Создаем список, куда будем помещать наши элементы 'cn*x^n'
        List<String> listToScreen = new ArrayList<>();
        // Перебираем содержимое результирующей коллекции
        for(Map.Entry<Integer, Integer> entry : resMap.entrySet()){
            /*
            Формируем текстовые элементы для коллекции,
            из которой будет формироваться отображение
            на экран.

            Через двойной тернарный оператор генерируем
            элементы:
            - если значение ключа 0, то для вывода на
            экран формируется только значение под ключом.
            - если значение ключа больше 0, то для вывода
            на экран формируется выражение вида 'Vn*x^K'
            - если значение под ключом 1, то для вывода
            на экран формируется выражение 'x^K'
            */
            String polynomElement = entry.getKey() == 0
                    ? String.valueOf(entry.getValue())
                    : (entry.getValue() == 1
                    ? "x^" + entry.getKey()
                    : entry.getValue() + "x^" + entry.getKey());
            // Добавляем полученный элемент в коллекцию
            listToScreen.add(polynomElement);
        }
        /*
        Возвращаем полученную строку.

        Метод static String join(CharSequence delimiter,
                                 Iterable<? extends CharSequence> elements) -
        возвращает новый, String состоящий из копий, CharSequence elements
        объединенных вместе с копией указанного delimiter.
        Подробнее см. StringJoin.txt
        */
        return String.join(" + ", listToScreen);
    }

    // Метод суммирует два полинома (многочлена) версия два
    private static Map<Integer, Integer> sumPolynomTwo(Map<Integer, Integer> poly_1,
                                                    Map<Integer, Integer> poly_2){
        /*
        Коллекция куда соберется сумма двух полиномов,
        в данном случае мы сразу заполнили результирующую
        коллекцию данными из первого полинома (как всегда,
        исходные данные мы не меняем).
        */
        Map<Integer, Integer> poly_res = new HashMap<>(poly_1);
        // Перебираем содержимое второго полинома
        for (Map.Entry<Integer, Integer> entry: poly_2.entrySet()) {
            /*
            Все операции проделанные в первом методе *.sumPolynom()
            и уложенные в 2-е строки, можно переписать в одну и снова
            двумя равносильными синтаксическими конструкциями:
            1. - poly_res.merge(entry.getKey(), entry.getValue(),
                                           (newVol, oldVol) -> newVol + oldVol);

            2. - poly_res.merge(entry.getKey(), entry.getValue(), Integer::sum);
            */
            poly_res.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }
        // Возвращаем результат
        return poly_res;
    }
}