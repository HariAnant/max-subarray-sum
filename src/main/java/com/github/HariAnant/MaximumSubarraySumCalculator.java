package com.github.HariAnant;

public class MaximumSubarraySumCalculator {

    public int maxSubarraySum(int[] input) {
        if (input == null || input.length == 0) {
            throw new IllegalArgumentException("input must not be null or empty");
        }

        int bestSoFar = input[0];

        for (int i = 0; i < input.length; i++) {
            int runningSum = 0;
            for (int j = i; j < input.length; j++) {
                runningSum += input[j];
                if (runningSum > bestSoFar) {
                    bestSoFar = runningSum;
                }
            }
        }

        return bestSoFar;
    }
}
