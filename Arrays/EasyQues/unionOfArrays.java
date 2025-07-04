package DSAJava.Arrays.EasyQues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class unionOfArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 3, 4, 5, 5, 6};
        int[] arr2 = {2, 3, 4, 5, 5, 5, 6, 7};
        int n = arr1.length;
        int m = arr2.length;
        int i = 0;
        int j = 0;

        // =====================
        // Brute Force Approach
        // =====================
        /*
        int[] newarr = new int[n + m];
        for (int p = 0; p < n; p++) {
            newarr[p] = arr1[p];
        }
        for (int q = 0; q < m; q++) {
            newarr[n + q] = arr2[q];
        }

        HashSet<Integer> set = new HashSet<>();
        for (int a : newarr) {
            set.add(a);
        }

        List<Integer> result = new ArrayList<>(set);
        Collections.sort(result);
        System.out.println(result);
        */

        // =====================
        // Optimal Approach
        // =====================
        List<Integer> result = new ArrayList<>();

        while (i < n && j < m) {
            if (arr1[i] == arr2[j]) {
                if (result.isEmpty() || result.get(result.size() - 1) != arr1[i]) {
                    result.add(arr1[i]);
                }
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                if (result.isEmpty() || result.get(result.size() - 1) != arr1[i]) {
                    result.add(arr1[i]);
                }
                i++;
            } else {
                if (result.isEmpty() || result.get(result.size() - 1) != arr2[j]) {
                    result.add(arr2[j]);
                }
                j++;
            }
        }

        // Add remaining elements from arr1
        while (i < n) {
            if (result.isEmpty() || result.get(result.size() - 1) != arr1[i]) {
                result.add(arr1[i]);
            }
            i++;
        }

        // Add remaining elements from arr2
        while (j < m) {
            if (result.isEmpty() || result.get(result.size() - 1) != arr2[j]) {
                result.add(arr2[j]);
            }
            j++;
        }

        System.out.println(result);
    }
}
