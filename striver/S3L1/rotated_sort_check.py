class Solution(object):
    def check(self, nums):
        count=0
        pin = 0
        for i in range(0,len(nums)-1):
            if nums[i]>nums[i+1]:
                pin = i
                count+=1
        if count==0 :
            return True
        if count==1:
            for i in range(pin+1,pin+len(nums)):
                if nums[i%len(nums)]>nums[(i+1)%len(nums)] :
                    return False
            return True
        return False
       