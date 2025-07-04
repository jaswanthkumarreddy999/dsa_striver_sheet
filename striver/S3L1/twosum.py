class Solution(object):
    def twoSum(self, nums, target):
        hm = {}
        for i in range(0,len(nums)):
            key = target - nums[i]
            if key in hm:
                return [hm[key],i]
            hm[nums[i]]=i
