#
#   method 1 = new array

# size = int(input())
# arr = [0]*size
# for i in range(0,size):
#     arr[i]=int(input())
# revarr = [0]*size
# for i in range(0,size):
#     revarr[i]=arr[size-1-i]
# for i in range(0,size):
#     print(revarr[i],end=" ")

# method 2 = by two pointer approach

# size = int(input())
# arr = [0]*size
# for i in range(0,size):
#     arr[i]=int(input())
# l = int(0)
# r = int(size-1)
# while l<r :
#     temp = arr[r]
#     arr[r] = arr[l]
#     arr[l] = temp
#     l=l+1
#     r=r-1
# for i in range(0,size):
#     print(arr[i],end=" ")

# method 3 = by recusive approach

size = int(input())
arr = [0]*size
for i in range(0,size):
    arr[i]=int(input())
def revarr(arr,l,r):
    if l>=r :
        return
    temp = arr[r]
    arr[r] = arr[l]
    arr[l] = temp
    
    return revarr(arr,l=l+1,r=r-1)
revarr(arr,0,size-1)
for i in range(0,size):
    print(arr[i],end=" ")