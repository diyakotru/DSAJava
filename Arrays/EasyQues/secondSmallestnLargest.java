public class secondSmallestnLargest {
    public static void main(String[] args) {
        int[] arr = {3, 34, 1, 23, 43, 21, 211, 23, 34, 21, 344, 1111, 90};

        // if there are less than 2 elements, we cannot find second largest/smallest
        if (arr.length < 2) {
            System.out.println("-1");
            return;
        }

        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        // Loop through every number
        for (int num : arr) {
            // Check for smallest and second smallest
            if (num < min) {
                smin = min;
                min = num;
            } else if (num < smin && num != min) {
                smin = num;
            }

            // Check for largest and second largest
            if (num > max) {
                smax = max;
                max = num;
            } else if (num > smax && num != max) {
                smax = num;
            }
        }

        // If we never updated smin or smax, print -1
        if (smin == Integer.MAX_VALUE) {
            smin = -1;
        }
        if (smax == Integer.MIN_VALUE) {
            smax = -1;
        }

        System.out.println("Second smallest = " + smin);
        System.out.println("Second largest = " + smax);
    }
}
