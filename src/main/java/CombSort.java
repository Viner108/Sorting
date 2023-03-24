import java.util.Arrays;

public class CombSort {
    /**
     * Идея
     * Точно такая как и в сортировке пузырьком только вместо стравнения попарно
     * соседний элементов тут сравниваются элементы через какой-то интервал.
     * @param args
     */
    public static void main(String[] args) {
        int[] array = new int []{2,1,4,3};
        combSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void combSort(int[] array) {
        int gap = array.length;
        boolean isSorted = false;

        while (!isSorted||gap != 1){
            if(gap>1){
                gap = gap *10/13;
            }else {
                gap =1;
            }
            isSorted = true;
            for (int i = gap; i < array.length; i++) {
                if(array[i-gap]> array[i]) {
                    int temp = array[i];
                    array[i] = array[i-gap];
                    array[i-gap] = temp;
                    isSorted =false;
                }
            }
        }
    }
}
