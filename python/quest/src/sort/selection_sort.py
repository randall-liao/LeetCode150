import sys

def selection_sort_desc(nums: list[int]) -> list[int]:
    length = len(nums)
    if length < 2:
        return nums
    for i in range(length):
        local_max = -sys.maxsize - 1
        local_max_index = -1
        for j in range(i, length):
            if nums[j] > local_max:
                local_max = nums[j]
                local_max_index = j
        nums[i], nums[local_max_index] = nums[local_max_index], nums[i]
    return nums

def selection_sort_asc(nums: list[int]) -> list[int]:
    length: int = len(nums)
    if length < 2:
        return nums
    for i in range(length):
        local_min_index = i
        for j in range(i, length):
            if nums[local_min_index] > nums[j]:
                local_min_index = j
        nums[i], nums[local_min_index] = nums[local_min_index], nums[i]
    return nums
