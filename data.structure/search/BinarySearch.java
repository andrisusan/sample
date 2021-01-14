package search;

public class BinarySearch {
    public static void main(String[] args) {
        // NOTE: Make sure to enable assert before running this code.
        // If you're using IntelliJ, you might be able to use this:
        // https://intellij-support.jetbrains.com/hc/en-us/community/posts/207014815-How-to-enable-assert

        int[] arr1 = {-2, 3, 4, 7, 8, 9, 11, 13};
        assert search(arr1, 11) == 6;
        assert search(arr1, 13) == 7;
        assert search(arr1, -2) == 0;
        assert search(arr1, 8) == 4;
        assert search(arr1, 6) == -1;
        assert search(arr1, 14) == -1;
        assert search(arr1, -4) == -1;

        int[] arr2 = {3};
        assert search(arr2, 6) == -1;
        assert search(arr2, 2) == -1;
        assert search(arr2, 3) == 0;

        System.out.println("If you didn't get an assertion error, this program has run successfully.");

        System.out.println(search(arr1, 11));
        System.out.println(findMaxValue(arr1));
        System.out.println(findMinValue(arr1));
    }

    static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length -1;

        while (left <= right) {
            // find middle
            int mid = (left + right) / 2;
            if (target == arr[mid]) {
                // target found
                return mid;
            }else if (target < arr[mid]) {
                // set right in left
                right = mid - 1;
            } else {
                // set left in right
                left = mid + 1 ;
            }
        }
        // if target not exist in source
        return -1;
    }

    static int findMaxValue(int[] arr) {
        int result = Integer.MIN_VALUE;
        for (int value : arr) {
            if (result < value) {
                result = value;
            }
        }
        return result;
    }

    static int findMinValue(int[] arr) {
        int result = Integer.MAX_VALUE;
        for (int value : arr) {
            if (result > value) {
                result = value;
            }
        }
        return result;
    }
}
