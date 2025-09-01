Two Sum
=======

**Problem Statement:** Given an array of integers `nums` and an integer `target`, return the indices of the two numbers such that they add up to `target`. You may assume that each input would have exactly one solution, and you may not use the same element twice. You can return the answer in any order.

Examples
--------

**Example 1:** Input: `nums = [2, 7, 11, 15]`, `target = 9` Output: `[0, 1]` Explanation: Because `nums[0] + nums[1] == 9`, we return `[0, 1]`.

**Example 2:** Input: `nums = [3, 2, 4]`, `target = 6` Output: `[1, 2]` Explanation: Because `nums[1] + nums[2] == 6`, we return `[1, 2]`.

Constraints
-----------

-   `2 <= nums.length <= 10^4`

-   `-10^9 <= nums[i] <= 10^9`

-   `-10^9 <= target <= 10^9`

-   **Only one valid answer exists.**

Solution Approach
-----------------

### Brute Force

The simplest approach is to use a nested loop. The outer loop iterates through each element, and the inner loop checks the remaining elements for a pair that sums to the `target`. If `nums[i] + nums[j] == target`, you return their indices.

### Optimized Solution

A more efficient approach is to use a **hash map**. By trading space for time, we can reduce the time complexity from quadratic to linear. The hash map stores each number and its index as we iterate through the array. For each number `nums[i]`, we calculate the `complement` (`target - nums[i]`) and check if the hash map already contains it. If it does, we have found our pair.

Complexity Analysis
-------------------

-   **Time Complexity:**  O(n) - A single pass through the array. Hash map lookups and insertions are on average O(1).

-   **Space Complexity:**  O(n) - In the worst case, the hash map will store up to n elements if no solution is found until the last element.

Code Implementation
-------------------

### Java

```
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        return null; // The problem guarantees a solution exists, but this handles cases where it doesn't
    }
}

```

### Python

```
from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        num_map = {}
        for i, num in enumerate(nums):
            diff = target - num
            if diff in num_map:
                return [num_map[diff], i]
            num_map[num] = i
        return []

if __name__ == "__main__":
    nums = [2, 7, 11, 15]
    target = 9
    print(Solution().twoSum(nums, target))

```

### Go

```
package main

func twoSum(nums []int, target int) []int {

    m := make(map[int]int)

    for i, v := range nums {

        diff := target - v
        if j, ok := m[diff]; ok {
            return []int{j, i}
        } else {
            m[v] = i
        }

    }
    return []int{}
}

func main() {

    nums := []int{2, 7, 11, 15}
    result := twoSum(nums, 9)
    println(result[0], result[1])
}

```