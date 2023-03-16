public class Sorting1 {
    public static void main(String[] args){
        int[] lines = new int[]{64, 64, 73, 41, 31, 53, 16, 24, 57, 42, 74, 55, 36, 58, 75,};
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
