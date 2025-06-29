# def merge(larr,rarr):
#      result = [0]*(len(larr)+len(rarr))
#      k = int(0)
#      l = int(0)
#      r = int(0)
#      while l<len(larr) and r < len(rarr):
#          if larr[l]>=rarr[r]:
#              result[k]=rarr[r]
#              k+=1
#              r+=1
#          else:
#              result[k] = larr[l]
#              k+=1
#              l+=1  
#      while l<len(larr):
#          result[k] = larr[l]
#          l+=1
#          k+=1
#      while r<len(rarr):
#          result[k] = rarr[r]
#          r+=1
#          k+=1
#      return result
# def removeDuplicates(nums):
#     fr = 0
#     sr = 0
#     while fr<len(nums):
#         if nums[sr] != nums[fr]:
#             sr+=1
#             nums[sr] = nums[fr]
#         fr+=1
#     return sr+1
# size1 = int(input())
# larr = [0]*size1
# for i in range(0,size1):
#     larr[i]=int(input())
# size2 = int(input())
# rarr = [0]*size2
# for i in range(0,size2):
#     rarr[i]=int(input())
# result = merge(larr,rarr)
# size = removeDuplicates(result)
# for i in range(0,size):
#     print(result[i],end=" ")


size1 = int(input())
larr = [0]*size1
for i in range(0,size1):
    larr[i]=int(input())
size2 = int(input())
rarr = [0]*size2
for i in range(0,size2):
    rarr[i]=int(input())
hs = set()
for i in range(0,size1):
    hs.add(larr[i])
for i in range(0,size2):
    hs.add(rarr[i])
print(hs)