public class Sorting2 {
    public static void main(String[] args) {
        int[] lines = new int[]{64, 42, 73, 41, 31, 53, 16, 24, 57, 42, 74, 55, 36, 58, 75,};

        for( int step = 0; step < lines.length; step++){
            printLines(lines);
          int index = min(lines, step)  ;
          int tmp = lines[step];
          lines[step] = lines[index];
          lines[index] = tmp;
        }

    }

    private static int min(int[] lines, int start) {
        int minIndex = start;
        int minValue = lines[start];
        for (int i = start + 1; i < lines.length; i++) {
            if (lines[i] < minValue) {
                minValue = lines[i];
                minIndex = i;
            }
        }
        return minIndex;
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
