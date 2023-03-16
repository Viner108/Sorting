public class Sorting2 {
    public static void main(String[] args) {
//  1.    задаем массив lines
        int[] lines = new int[]{2,1};
        for( int step = 0; step < lines.length; step++){
            printLines(lines);
//  11.   создаем переменную и присваеваем ей индекс минимального числа массива
          int index = min(lines, step);
//  12.   создаем переменную и присваеваем ей число под нулевым индексом
          int tmp = lines[step];
//  13.   меняем местами число под нулевым индексом с числом из программы
          lines[step] = lines[index];
          lines[index] = tmp;
//  14.   возращаемся обратно в цикл
        }

    }
//  2.    программа для вычисления индекса минимального числа в массиве не включая нулевой
    private static int min(int[] lines, int start) {
//  3.     создаем переменную и присваемаем ей зачение 0
        int minIndex = start;
//  4.     содаем переменную и присваеваем ей число из массива под индексом 0
        int minValue = lines[start];
//  5.     создаем цикл исключая из него 0 элемент
        for (int i = start + 1; i < lines.length; i++) {
//  6.     создаем функцию для сравнения числа под индексом i с числом под индексом 0
            if (lines[i] < minValue) {
//  7.     если условние выполняется присваеваем переменной под индесом 0 число под индексом i
                minValue = lines[i];
//  8.     и присваеваем переменной индекс i
                minIndex = i;
//  9.     возврашаемся в цикл
            }
        }
//  10.    возвращаем индекс минимального числа
        return minIndex;
    }
// программа для для добавления знаков
    private static void printLines(int[] lines) {
        System.out.print("[");
        for (int i = 0; i < lines.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(lines[i]);
        }
        System.out.println("]");
    }
}
