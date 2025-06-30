class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        c=0
        mc=0
        for num in nums:
            if num:
                c+=1
            else:
                mc=max(mc,c)
                c=0
        mc=max(mc,c)
        return mc