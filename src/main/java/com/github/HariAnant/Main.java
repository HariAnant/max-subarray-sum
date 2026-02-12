import com.github.HariAnant.bruteforce.MaximumSubarraySumCalculator;

void main() {
    MaximumSubarraySumCalculator calculator = new MaximumSubarraySumCalculator();
    int[] input = {1, -2, 3, 4, -1, 2, 1, -5, 4};
    int result = calculator.maxSubarraySum(input);
    System.out.println("Maximum subarray sum: " + result);
}