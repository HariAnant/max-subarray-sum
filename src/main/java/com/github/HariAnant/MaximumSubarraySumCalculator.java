package com.github.HariAnant;

public class MaximumSubarraySumCalculator {

    public int maxSubarraySum(int[] input) {
        if (input == null || input.length == 0) {
            throw new IllegalArgumentException("input must not be null or empty");
        }

        int maxSum = Integer.MIN_VALUE;
        int prefixSum = 0;
        int minPrefixSum = 0;

        for (int value : input) {
            prefixSum += value;
            maxSum = Math.max(maxSum, prefixSum - minPrefixSum);
            minPrefixSum = Math.min(minPrefixSum, prefixSum);
        }

        return maxSum;
    }
}
