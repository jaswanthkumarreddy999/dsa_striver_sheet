class Solution(object):
    def moveZeroes(self, nums):
        sr=0
        for fr in range(0,len(nums)):
            if(nums[fr]!=0):
                nums[sr]=nums[fr]
                sr+=1
        while sr<len(nums):
            nums[sr]=0
            sr+=1