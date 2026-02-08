package com.github.HariAnant;

public class MaximumSubarraySumCalculator {

    public int maxSubarraySum(int[] input) {
        int bestSoFar = input[0];
        int bestEndingHere = input[0];

        for (int i = 1; i < input.length; i++) {
            bestEndingHere = Math.max(input[i], bestEndingHere + input[i]);
            bestSoFar = Math.max(bestSoFar, bestEndingHere);
        }

        return bestSoFar;
    }
}
