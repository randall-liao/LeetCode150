

from arrayI.max_consecutive_ones import Solution

def test_example_one():
    sol: Solution = Solution()
    nums = [1,1,0,1,1,1]
    expected_max_length = 3
    assert sol.findMaxConsecutiveOnes(nums) == expected_max_length

def test_all_one_array():
    sol: Solution = Solution()
    nums = [1, 1, 1, 1, 1]
    expected_max_length = 5
    assert sol.findMaxConsecutiveOnes(nums) == expected_max_length

def test_all_zero_array():
    sol: Solution = Solution()
    nums = [0, 0, 0, 0, 0]
    expected_max_length = 0
    assert sol.findMaxConsecutiveOnes(nums) == expected_max_length

def test_end_or_begin_zero_array():
    sol: Solution = Solution()
    nums_end = [1, 1, 1, 1, 0]
    nums_begin = [0, 1, 1, 1, 1]
    expected_max_length = 4
    assert sol.findMaxConsecutiveOnes(nums_end) == expected_max_length
    assert sol.findMaxConsecutiveOnes(nums_begin) == expected_max_length

