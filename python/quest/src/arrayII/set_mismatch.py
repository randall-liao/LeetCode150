


from typing import List
class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        number_count: dict[int, int] = {}
        for inx in range (1, len(nums) + 1):
            number_count[inx] = 0
        for num in nums:
            number_count[num] += 1
        result: List[int] = [0, 0]
        print(number_count)
        for _, (k, v) in enumerate(number_count.items()):
            print(f"key:{k}, value:{v}")
            if v == 0:
                result[1] = k
            elif v == 2:
                result[0] = k
        print(result)
        return result