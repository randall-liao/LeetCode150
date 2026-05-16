def insertion_sort_desc(nums: list[int]) -> list[int]:
    length: int = len(nums)
    if length < 2:
        return nums
    for i in range(1, length):
        j = i
        while j > 0 and nums[j - 1] < nums[j]:
            # While i is greater than i - 1 search for the position to insert the number
            _swap(nums, j, j - 1)
            j -= 1
    return nums

def insertion_sort_asc(nums: list[int]) -> list[int]:
    length: int = len(nums)
    if length < 2:
        return nums
    for i in range(1, length):
        j = i
        while j > 0 and nums[j] < nums[j - 1]:
            _swap(nums, j, j - 1)
            j -= 1
    return nums

def _swap(nums: list[int], i: int, j: int) -> list[int]:
    nums[i], nums[j] = nums[j], nums[i]
    return nums
