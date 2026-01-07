

from arrayI.shuffle_the_array import Solution

def test_example_one():
    sol: Solution = Solution()
    assert sol.shuffle([2,5,1,3,4,7], 3) == [2,3,5,4,1,7]

def test_example_two():
    sol: Solution = Solution()
    assert sol.shuffle([1,2,3,4,4,3,2,1], 4) == [1,4,2,3,3,2,4,1]
