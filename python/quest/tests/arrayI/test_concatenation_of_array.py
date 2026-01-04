
from arrayI.concatenation_of_array import Solution

def test_example_one():
    sol = Solution()
    assert sol.getConcatenation([1, 2, 3]) == [1, 2, 3, 1, 2, 3]

def test_empty_array():
    sol = Solution()
    assert sol.getConcatenation([]) == []