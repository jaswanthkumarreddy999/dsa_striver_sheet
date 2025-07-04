nums = [2,3,5,1,9]
k = 10

def lsa1(nums,k):
    ml = 0
    for i in range(0,len(nums)):
        sum=0
        for j in range(i,len(nums)):
            sum+=nums[j]
            if sum == k:
                ml = max(ml,j-i+1)
    return ml

def lsa2(nums,k):
    hs = {}
    hs[0]=-1
    sum=0
    ml=0
    for i in range(0,len(nums)):
        sum+=nums[i]
        hs[sum]=i
        if sum-k in hs:
            ml=max(i-hs[sum-k],ml)
    return ml
print(lsa2(nums,k))
def longestSubarray(self, arr, k):
    hs = {}
    hs[0]=-1
    sum = 0
    ml=0
    for i in range(0,len(arr)):
        sum+=arr[i]
        if not sum in hs:
            hs[sum]=i
        if sum-k in hs:
            ml=max(i-hs[sum-k],ml)
    return ml