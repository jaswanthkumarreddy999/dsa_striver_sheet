class Solution(object):
    def sortColors(self, nums):
        c0=int(0)
        c1=int(0)
        c2=int(0)
        for i in range(0,len(nums)):
            if nums[i] == 0 :
                c0+=1
            elif nums[i] == 1:
                c1+=1
            else:
                c2+=1
        i = int(0)
        while (c0 > 0):
            nums[i]=0
            c0-=1
            i+=1
        while (c1 > 0):
            nums[i]=1
            c1-=1
            i+=1
        while (c2 > 0):
            nums[i]=2
            c2-=1
            i+=1
