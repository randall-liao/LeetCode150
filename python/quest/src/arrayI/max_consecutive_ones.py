# Given a binary array nums, return the maximum number of consecutive 1's in the array.

# Example 1:

# Input: nums = [1,1,0,1,1,1]
# Output: 3
# Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
# Example 2:

# Input: nums = [1,0,1,1,0,1]
# Output: 2

from typing import List

class Solution:

    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        max_length: int = 0
        current_length: int = 0
        for _, num in enumerate(nums):
            if num == 1:
                current_length += 1
            else:
                current_length = 0
            if current_length > max_length:
                max_length = current_length
        return max_length

if __name__ == "__main__":
    sol: Solution = Solution()
    print(sol.findMaxConsecutiveOnes([1,1,0,1,1,1]))
