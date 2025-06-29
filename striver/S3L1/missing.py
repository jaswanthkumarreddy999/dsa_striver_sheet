class Solution(object):
    def missingNumber1(self, nums):
        num = len(nums)
        expected_sum = (num*(num+1))//2
        actual_sum=0
        for i in range(0,num):
            actual_sum+=nums[i]
        return expected_sum-actual_sum
    def missingNumber2(self, nums):
        ans = 0
        for i in range(0,len(nums)+1):
            ans^=i
        for i in range(0,len(nums)):
            ans^=nums[i]
        return ans