public class MergeSort {
    /**
     * 1.есть массив чисел
     * 2.этот массив чисел разделяется на одномерные массивы
     * 3.одномерные массивы соединяются в массивы в два раза больше
     * 4.одновременно сортирую числа в новом массиве
     * 5.так продолжается до тех пор пока новый массив не будет равен по длинне
     * исходому массиву
     */

    public static void main(String[] args) {
        int[] lines = new int[]{2,1,3,0};
        System.out.println(merge(lines));

    }
    public static int[] merge(int[] lines){
        /**Параметры:
         *  int[] temp - массив чтобы менять местами новый и исходный массив
         * int[] currentSrc - исходный массив
         * int[] currentDest - новый массив после слияния
         * int size - размер массивов
         */
        int[] temp;
        int[] currentSrc = lines;
        int[] currentDest = new int[lines.length];

        int size = 1;
        while (size < lines.length){
            for (int i = 0; i < lines.length; i+= 2*size) {
                merge(currentSrc,i,currentSrc,i+size,currentDest,i,size);
            }
            temp = currentSrc;
            currentSrc = currentDest;
            currentDest = temp;
            size = size*2;
            printLines(lines);
        }
        return currentSrc;
    }
    private static void merge(int[] src1, int src1Start, int[] src2, int src2Start, int[] dest, int destStart, int size){
    /**Параметры:
     * int[]scr1 - первый массив для слияния
     * int src1Start - индекс числа исходного массива,начало первого массива
     * int[]scr2 -второй массив для слияния
     * int src2Start - индекс числа исходного массива,начало второго массива
     * int[] dest - пустой массив для слияния первого и второга массива
     * int destStart - индекс начала в нового массива
     * int size - размер массивов
     * int iterationCount - количество итерраций цикла для соединения двух массивов
     * или колличество элементов в двух массивов
     * int src1End - размер или конец первго массива
     * int scr2End - размер или конец первго массива
     */
       int index1 = src1Start; // присвоение переменной индекс начала из первого массива
        int index2 = src2Start; // присвоение переменной индекс начала из второго массива

        int src1End = Math.min(src1Start + size, src1.length);// вычисление размера или конца первого массива
        int scr2End = Math.min(src2Start + size, src2.length);// вычисление размера или конца первого массива

        int iterationCount =src1End- src1Start + scr2End - src2Start;// вычисление колличества повторения цикла или
                                                                     //колличество элементов в двух массивах

        for (int i = destStart; i < destStart + iterationCount ; i++) {//цикл для изменения индекса
            if (index1 < src1End &&(index2 >= scr2End || src1[index1]< src2[index2])){// условие при котором начало
                // индекс начала первого массива должно быть меньше индекса конца второго массива и (индекс начала
                //второго массива должен быть больше либо равен индексу конца второго массива или значение под индексом
                // начала первого массива в первом массиве должен быть меньше значения под индексом начала второго
                //массива  во втором массиве
                //если условие верное
                dest[i] = src1[index1];//значение в новом массиве равно значению под индексом начала первого массива
                index1++;//индекс начала первого массива увеличить на 1
                //если условие не верно
            }else {
                dest[i] = src2[index2];//значение в новом массиве равно значению под индексом начала второго массива
                index2++;//индекс начала второго массива увеличить на 1
            }//повторить цикл
            }
        }
    private static void printLines(int[] lines){
        System.out.print("[");
        for (int i = 0; i < lines.length; i++) {
            if(i>0){
                System.out.print(", ");
            }
            System.out.print(lines[i]);
        }
        System.out.println("]");
    }
    }

