import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSort {
    /**
     * Идея
     * Есть массив целочисленных значений. Неучитывая первый элемент ма начием сортировать
     * нашу оставшуюся часть. Мы берем следующий элемент и сравниваем с предыдущим.
     * Если предыдущее значение больше текущего мы сдвигаем предыдущее значение влево и так до тех
     * пор пока наш элемент не станет на свое место(то есть следующий элемент будет меньше текущего).
     * Повторяем это со всеми остальными элементами.
     */
    public static void main(String[] args) {
        int[] array = new int[]{2,1,4,3};//исходный массив целочисленных значений
        insertionSort(array);// вызов финкции insertionSort
        System.out.println(Arrays.toString(array));// вывод на печать
    }
    public static void insertionSort(int[] array){//функция insertionSort сортировки
        for (int i = 1; i < array.length; i++) {//цикл с условием его выполнения
            int current = array[i];//объявление переменной со значением текущего элемента
            int j = i;// индекс текущего элемента
            while (j > 0 && array[j-1] > current){//цикл для сдига элементов
                //если условие выполняется
                array[j] = array[j-1];//значение под текущим индексом равно значениию под предыдущим индеком
                j--;//текущий индекс - 1
            }
            //если условие не выполняется выходим из цикла
            array[j] = current;//значение под текущим индексом равно значению переменной current
        }
        //если условие не выполняется выходим из цикла
    }
}