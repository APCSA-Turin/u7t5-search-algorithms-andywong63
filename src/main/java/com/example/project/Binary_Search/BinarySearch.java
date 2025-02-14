package com.example.project.Binary_Search;

public class BinarySearch {
    // implements binary search on the elements list for target,
    // and returns the index at which the target is found, or -1 if
    public static int binarySearch(int[] elements, int target) {
        int leftIdx = 0;
        int rightIdx = elements.length - 1;

        while (leftIdx <= rightIdx) {
            int middleIdx = (leftIdx + rightIdx) / 2;

            int current = elements[middleIdx];
            if (current == target) {
                return middleIdx;
            } else if (current < target) {
                // Remove everything before
                leftIdx = middleIdx + 1;
            } else {
                // Remove everything after
                rightIdx = middleIdx - 1;
            }

        }
        return -1; // not found
    }
}
