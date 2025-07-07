package EasyQues;
public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        System.out.println("Original Array:");
        print(arr);

        System.out.println("\nBrute Force - Left Rotation:");
        bruteLeftRotate(arr, k);
        print(arr);

        // Resetting for next rotation
        arr = new int[]{1, 2, 3, 4, 5};
        System.out.println("\nBrute Force - Right Rotation:");
        bruteRightRotate(arr, k);
        print(arr);

        arr = new int[]{1, 2, 3, 4, 5};
        System.out.println("\nOptimal - Left Rotation:");
        optimalLeftRotate(arr, k);
        print(arr);

        arr = new int[]{1, 2, 3, 4, 5};
        System.out.println("\nOptimal - Right Rotation:");
        optimalRightRotate(arr, k);
        print(arr);
    }

    // ---------- Brute Force ----------
    static void bruteLeftRotate(int[] arr, int k) {
        int n = arr.length;
        k %= n;
        for (int i = 0; i < k; i++) {
            int temp = arr[0];
            for (int j = 0; j < n - 1; j++)
                arr[j] = arr[j + 1];
            arr[n - 1] = temp;
        }
    }

    static void bruteRightRotate(int[] arr, int k) {
        int n = arr.length;
        k %= n;
        for (int i = 0; i < k; i++) {
            int temp = arr[n - 1];
            for (int j = n - 1; j > 0; j--)
                arr[j] = arr[j - 1];
            arr[0] = temp;
        }
    }

    // ---------- Optimal ----------
    static void optimalLeftRotate(int[] arr, int k) {
        int n = arr.length;
        k %= n;
        reverse(arr, 0, k);
        reverse(arr, k, n);
        reverse(arr, 0, n);
    }

    static void optimalRightRotate(int[] arr, int k) {
        int n = arr.length;
        k %= n;
        reverse(arr, n - k, n);
        reverse(arr, 0, n - k);
        reverse(arr, 0, n);
    }

    // ---------- Utility ----------
    static void reverse(int[] arr, int start, int end) {
        end--;
        while (start < end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }

    static void print(int[] arr) {
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }
}
