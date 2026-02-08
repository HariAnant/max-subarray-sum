package com.github.HariAnant;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSubarraySumCalculatorTest {

    // FR001 - Test with a simple array of positive integers
    @Test
    @DisplayName("FR001 - Simple positive array returns sum of all elements")
    public void fr001_simplePositiveArray_returnsSumOfAllElements() {
        int[] input = {1, 2, 3, 4, 5};

        int result =
                new MaximumSubarraySumCalculator()
                        .maxSubarraySum(input);

        assertEquals(15, result);
    }
}
