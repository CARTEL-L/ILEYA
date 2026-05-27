import java.util.Arrays;
public class TaskOne {
    public static int[][] splitEvenOdd(int[] arr) {
        int[] even = new int[(arr.length+1)/2];
        int[] odd = new int[arr.length/2];
        int evenNum = 0;
        int oddNum = 0;
        for (int count = 0; count < arr.length; count++) {
            if (count % 2 == 0) {
                even[evenNum++] = arr[count];
            } else {
                odd[oddNum++] = arr[count];
            }
        }

        return new int[][] { even, odd };
    }

    public static void main(String[] args) {
        int[] arr = {45, 60, 3, 10, 9, 22};
        int[][] result = splitEvenOdd(arr);
        System.out.println(Arrays.deepToString(result));
    }
}
