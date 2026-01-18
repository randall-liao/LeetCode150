

from arrayII.set_mismatch import Solution

def test_example_one():
    sol: Solution = Solution()
    input = [1,2,2,4]
    expected = [2,3]
    assert sol.findErrorNums(input) == expected
    

def test_exapmle_two():
    sol: Solution = Solution()
    input = [4,8,1,5,2,7,4,6]
    expected = [4,3]
    assert sol.findErrorNums(input) == expected

def test_exapmle_three():
    sol: Solution = Solution()
    input = [2, 2]
    expected = [2, 1]
    assert sol.findErrorNums(input) == expected