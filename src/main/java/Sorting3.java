public class Sorting3 {
//    1.есть массив из чисел
//    2.берется первый элемент, сравнивается с остальными
//    и на основе этих данных создается два отдельных массива( один с числами
//    меньше первого элемента и второй с числами больше первого элемента либо равным ему)
//    3. из первого массива берется опять первый элемент, сравнивается и
//    опять создается еще два массива
//    4. повторяется пока во всех массивах не останется
//    по одному элементу
    public static void main(String[] args) {
        int[] lines = new int[]{2,1};

        quickSort(lines, 0, lines.length - 1);
    }

    private static void quickSort(int[] lines, int from, int to) {
        if (from < to) {
            int divideIndex = partition(lines, from, to);
            printLines(lines);
            quickSort(lines, from, divideIndex - 1);
            quickSort(lines, divideIndex, to);
        }
    }

    private static int partition(int[] lines, int from, int to) {
        int rightIndex = to;
        int leftIndex = from;

        int pivot = lines[from];
        while (leftIndex <= rightIndex) {
            while (lines[leftIndex] < pivot) {
                leftIndex++;
            }
            while (lines[rightIndex] > pivot) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                swap(lines, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    private static void swap(int[] lines, int index1, int index2) {
        int temp = lines[index1];
        lines[index1] = lines[index2];
        lines[index2] = temp;
    }

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
