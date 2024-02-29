class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        if target in nums:
            return nums.index(target)
        else:
            cnt = 0
            for i in nums:
                if i > target :
                    return cnt
                cnt = cnt + 1
            return len(nums)