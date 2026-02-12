package com.github.HariAnant.bruteforce;

public class MaximumSubarraySumCalculator {

    public int maxSubarraySum(int[] input) {
        if (input == null || input.length == 0) {
            throw new IllegalArgumentException("input must not be null or empty");
        }

        int bestSoFar = input[0];
        int bestEndingHere = input[0];

        for (int i = 1; i < input.length; i++) {
            bestEndingHere = Math.max(input[i], bestEndingHere + input[i]);
            bestSoFar = Math.max(bestSoFar, bestEndingHere);
        }

        return bestSoFar;
    }
}
