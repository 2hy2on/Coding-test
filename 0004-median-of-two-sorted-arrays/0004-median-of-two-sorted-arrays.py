class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        all_ = sorted(nums1 + nums2)
        if len(all_) % 2 == 0:
            mid = float(all_[len(all_) // 2 - 1] + all_[len(all_) // 2]) / 2
        else:
            mid = float(all_[len(all_) // 2])
        return mid
        