import java.util.*;

public class SecondLargestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int smax = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            if (max < arr[i]) {
                smax = max;
                max = arr[i];
            } else if (max > arr[i] && arr[i] > smax) {
                smax = arr[i];
            }
        }
        System.out.print(smax);
    }
}