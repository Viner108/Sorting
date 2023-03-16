public class BubbleSort {
    public static void main(String[] args){
        int[] lines = new int[]{2,1};
        printLines(lines);
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < lines.length; i++) {
                if (lines[i] < lines[i - 1]) {
                    int temp = lines[i];
                    lines[i] = lines[i - 1];
                    lines[i - 1] = temp;
                    isSorted = false;
                }
            }
        }printLines(lines);

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
