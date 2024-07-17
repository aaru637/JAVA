package com.dk.algoTutor.arrays;

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
        result[0] = findFirstPosition(nums, target, 0, nums.length - 1);
        result[1] = findLastPosition(nums, target, 0, nums.length - 1);
        return result;
    }

    /*
     * Service Method
     */
    private static int findFirstPosition(int[] nums, int target, int start, int end) {
        while(start <= end) {
            int mid = (start + end) / 2;
            if(nums[mid] == target) {
                if(mid == 0 || nums[mid - 1] != target) {
                    return mid;
                }
                else {
                    end = mid - 1;
                }
            }
            else if(nums[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    private static int findLastPosition(int[] nums, int target, int start, int end) {
        while(start <= end) {
            int mid = (start + end) / 2;
            if(nums[mid] == target) {
                if(mid == nums.length - 1 || nums[mid + 1] != target) {
                    return mid;
                }
                else {
                    start = mid + 1;
                }
            }
            else if(nums[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
