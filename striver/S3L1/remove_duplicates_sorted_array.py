class Solution(object):
    def removeDuplicates(self, nums):
        fr = 0
        sr = 0
        while fr<nums.length:
            if nums[sr] != nums[fr]:
                sr+=1
                nums[sr] = nums[fr]
            fr+=1
        return sr+1
        