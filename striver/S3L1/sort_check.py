size = int(input())
arr = [0]*size
for i in range (0,size):
    arr[i] = int(input())
def check(arr):
    for i in range(0,size-1):
        if(arr[i]>arr[i+1]):
            return False
    return True
if(check(arr)):
    print("Array is Sorted")
else:
    print("Array is not sorted")