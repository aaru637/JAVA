package com.dk.algoTutor.arrays;

import java.util.Arrays;

public class ProblemServiceMethods {

    /*
     * 1. Binary Search
     */
    public static int binarySearch(int[] arr, int key) {
        return binarySearchHelper(arr, key, 0, arr.length - 1);
    }

    /*
     * Service Method
     */
    private static int binarySearchHelper(int[] arr, int key, int low, int high) {
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                return binarySearchHelper(arr, key, mid + 1, high);
            } else {
                return binarySearchHelper(arr, key, low, mid - 1);
            }
        }
        return -1;
    }

    /*
     * 2. Find Duplicate Number
     */
    public static int findDuplicate(int[] nums) {
        int arr[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]] = arr[nums[i]] + 1;
            if (arr[nums[i]] > 1) {
                return nums[i];
            }
        }
        return -1;
    }

    /*
     * 3. Search Insert Position
     */
    public static int searchInsert(int[] nums, int target) {
        int pos = binarySearchHelper(nums, target, 0, nums.length - 1);
        if (pos == -1) {
            int start = 0, end = nums.length - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (nums[mid] < target) {
                    if (mid != nums.length - 1) {
                        if (nums[mid + 1] > target) {
                            return mid + 1;
                        }
                    } else {
                        return nums.length;
                    }
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return pos;
    }

    /*
     * 4. Sort Colors
     */
    public static void sortColors(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    /*
     * 5. Find First and Last Position
     */
    public static int[] findFirstLastPosition(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findPosition(nums, target, 0, nums.length - 1, true);
        result[1] = findPosition(nums, target, 0, nums.length - 1, false);
        return result;
    }

    /*
     * Service Method
     */
    private static int findPosition(int[] nums, int target, int start, int end, boolean isFirst) {
        if (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                if (mid == (isFirst ? 0 : nums.length - 1)) {
                    return mid;
                } else if (isFirst ? (nums[mid - 1] < target)
                        : (nums[mid + 1] > target)) {
                    return mid;
                } else {
                    return isFirst ? findPosition(nums, target, start, mid - 1, isFirst)
                            : findPosition(nums, target, mid + 1, end, isFirst);
                }
            } else if (nums[mid] < target) {
                return findPosition(nums, target, mid + 1, end, isFirst);
            } else {
                return findPosition(nums, target, start, mid - 1, isFirst);
            }
        }
        return -1;
    }

    /*
     * 6. Find the length of the last word
     */
    public static int findLengthLastWord(String input) {
        int end = input.length() - 1;
        while (end != 0 && input.charAt(end - 1) != ' ') {
            end--;
        }
        return input.length() - end;
    }

    /*
     * 7. Set Matrix Zones
     */
    public static void setMatrixZones(int[][] input) {
        int tempI = -1, tempJ = -1;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                if (input[i][j] == 0 && i != tempI && j != tempJ) {
                    tempI = i;
                    tempJ = j;
                    for (int k = 0; k < input.length; k++) {
                        input[i][k] = 0;
                    }
                    for (int k = 0; k < input[0].length; k++) {
                        input[k][j] = 0;
                    }
                }
            }
        }
    }

    /*
     * 8. Pascal Triangle
     */
    public static int[][] pascalTriangle(int row) {
        int[][] result = new int[row][row];
        result[0][0] = 1;
        for (int i = 1; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (j == 0 || j == i) {
                    result[i][j] = 1;
                } else {
                    result[i][j] = result[i - 1][j - 1] + result[i - 1][j];
                }
            }
        }
        return result;
    }

    /*
     * 9. Find Single Element in a Sorted Array.
     */
    public static int singleElementSortedArray(int[] input) {
        for (int i = 1; i < input.length; i++) {
            if ((input[i - 1] != input[i])) {
                if (i == input.length - 1) {
                    return input[i];
                } else if (i == 1) {
                    return input[i - 1];
                } else if (input[i] != input[i + 1]) {
                    return input[i];
                }
            }
        }
        return -1;
    }

    /*
     * 10. Search Value in 2D Row Sorted Matrix
     */
    public static boolean search2dMatrix(int[][] input, int target) {
        for (int[] input1 : input) {
            if (target < input1[input[0].length - 1]) {
                for (int j = 0; j < input[0].length; j++) {
                    if (target == input1[j]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /*
     * 11. Power of x, n
     */
    public static float power(float base, int exponent) {
        float result = 1f;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }

    /*
     * 12. Find a Peak Element
     */
    public static int[] findPeakElement(int[][] input) {
        int start = 0, end = input[0].length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            int rowMax = 0;
            for (int i = 0; i < input.length; i++) {
                if (input[i][mid] > input[rowMax][mid]) {
                    rowMax = i;
                }
            }
            boolean isLeftSmaller = (mid == 0 || input[rowMax][mid] > input[rowMax][mid - 1]);
            boolean isRightSmaller = (mid == input[0].length - 1 || input[rowMax][mid] > input[rowMax][mid + 1]);

            if (isLeftSmaller && isRightSmaller) {
                return new int[] { rowMax, mid };
            } else if (!isLeftSmaller) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return new int[] { -1, -1 };
    }

    /*
     * Additional Problem -> Find the element which helds the given position in the
     * final array of two sorted arrays.
     */
    public static int findKthPositionalElement(int[] first, int[] second, int target) {
        int firstLength = 0, secondLength = 0;
        int element = 0;
        int[] temp = new int[first.length + second.length];
        int tempK = 0;
        while (target >= 0) {
            if (firstLength <= first.length - 1 && secondLength <= second.length - 1) {
                if (first[firstLength] <= second[secondLength]) {
                    element = first[firstLength];
                    temp[tempK++] = first[firstLength];
                    firstLength++;
                } else if (secondLength <= second.length - 1) {
                    element = second[secondLength];
                    temp[tempK++] = second[secondLength];
                    secondLength++;
                }
            } else {
                if (firstLength <= first.length - 1) {
                    element = first[firstLength];
                    temp[tempK++] = first[firstLength];
                    firstLength++;
                } else if (secondLength <= second.length - 1) {
                    element = second[secondLength];
                    temp[tempK++] = second[secondLength];
                    secondLength++;
                }
            }
            target--;
        }
        System.out.println(Arrays.toString(temp));
        return element;
    }

    public static int findKthElement(int[] first, int[] second, int target) {
        int m = first.length, n = second.length;
        if (target > (m + n) || target < 0) {
            return -1;
        }
        int i = 0, j = 0, count = 0, result = 0;

        while (i < m && j < n) {
            if (first[i] < second[j]) {
                result = first[i];
                i++;
            } else {
                result = second[j];
                j++;
            }
            if (count == target) {
                return result;
            }
            count++;
        }
        while (i < m) {
            result = first[i];
            i++;
            if (count == target) {
                return result;
            }
            count++;
        }

        while (j < n) {
            result = second[j];
            j++;
            if (count == target) {
                return result;
            }
            count++;
        }
        return result;
    }
}
