size = int(input())
arr = [0]*size
for i in range(0,size):
    arr[i]=int(input())
def merge(larr,rarr):
     result = [0]*(len(larr)+len(rarr))
     k = int(0)
     l = int(0)
     r = int(0)
     while l<len(larr) and r < len(rarr):
         if larr[l]>=rarr[r]:
             result[k]=rarr[r]
             k+=1
             r+=1
         else:
             result[k] = larr[l]
             k+=1
             l+=1  
     while l<len(larr):
         result[k] = larr[l]
         l+=1
         k+=1
     while r<len(rarr):
         result[k] = rarr[r]
         r+=1
         k+=1
     return result
def merge_sort(arr,l,r):
    if l == r:
        unit = [0]
        unit[0] = arr[l]
        return unit
    mid = (l+r)//2
    larr = merge_sort(arr,l,mid)
    rarr = merge_sort(arr,mid+1,r)
    return merge(larr,rarr)
arr = merge_sort(arr,0,size-1)

for i in range(0,size):
        print(arr[i],end=" ")