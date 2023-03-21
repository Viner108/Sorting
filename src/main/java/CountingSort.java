import java.util.Arrays;

public class CountingSort {
    /**
     * Идея
     * Есть массив целочисленных значений в каком-то приделе. Создаем новый массив заносим в него колличество
     *раз которое число в массиве повторяется. С помощью нового массива записываем числа по порядку в исходный массив
     */
    public static void main(String[] args) {
        int [] array = new int[] {2,1};// задается массив целочисленных значений типа int
        countSort(array);// вызыывается функция countSort с параментром int[] array
        System.out.println(Arrays.toString(array));// вывдиться на печать
    }
    public static void countSort (int[] array){//функция countSort
        final int MAX_VALUE = 3;// объявляется переменная типа int MAX_VALUE это размер нашего нового массива
                                 //и предел значений чисел в исходном массиве

        int [] count = new int[MAX_VALUE];// объявляется новый массив типа int с размером MAX_VALUE
        for (int i = 0; i < array.length; i++) {// цикл
            count[array[i]] = count[array[i]] + 1;// в новом массиве под индексом значения исходного массива
                                                  //прибавляем еденицу
        }

        int linesindex = 0;// объявление новой переменой linesindex
        for (int i = 0; i < count.length; i++) {//цикл и условие его выполнения
            // если условие выполняется, заходим в цикл
            for (int j = 0; j < count[i]; j++) {//цикл и условие его выполнения
                //если условие выполняется, заходим в цикл
                array[linesindex] = i;// в исходном массиве значение под индексом linesindex заменяем на значние
                                      // i
                linesindex++;// прибавляем 1 к переменной linesindex
            }// если условие не выполяется, выходим из цикла
        }
    }
}
