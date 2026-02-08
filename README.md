# Maximum Subarray Sum (Kadane's Algorithm)

Small Java 25 Maven project that computes the maximum subarray sum using
Kadane's algorithm.

## Features
- Linear time O(n) implementation
- Handles all-negative arrays
- Simple, test-driven examples

## Requirements
- Java 25
- Maven 3.9+

## Build and Test
```bash
mvn test
```

## Usage
```java
int[] input = {1, -3, 4, -2, 2, 1, -5, 4};
int result = new MaximumSubarraySumCalculator().maxSubarraySum(input);
// result = 5 (subarray: 4, -2, 2, 1)
```

## Complexity
- Time: O(n)
- Space: O(1)

## Project Structure
- `src/main/java/com/github/HariAnant/MaximumSubarraySumCalculator.java`
- `src/test/java/com/github/HariAnant/MaximumSubarraySumCalculatorTest.java`

## Contributing
Issues and pull requests are welcome. Please add tests for any new behavior.

