public class MergeSort {
    /**
     * 1.есть массив чисел
     * 2.этот массив чисел разделяется на одномерные массивы
     * 3.одномерные массивы соединяются в массивы в два раза больше
     * 4.одновременно сортирую числа в новом массиве
     * 5.так продолжается до тех пор пока новый массив не будет равен по длинне
     * исходому массиву
     * @param args
     */
    public static void main(String[] args) {
        int[] lines = new int[]{2,1,4,8,13,11,20,18,17};
        System.out.println(merge(lines));

    }
    public static int[] merge(int[] lines){
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
        int index1 = src1Start;
        int index2 = src2Start;

        int src1End = Math.min(src1Start + size, src1.length);
        int scr2End = Math.min(src2Start + size, src2.length);

        int iterationCount =src1End- src1Start + scr2End - src2Start;

        for (int i = destStart; i < destStart + iterationCount ; i++) {
            if (index1 < src1End &&(index2 >= scr2End || src1[index1]< src2[index2])){
                dest[i] = src1[index1];
                index1++;
            }else {
                dest[i] = src2[index2];
                index2++;
            }
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

