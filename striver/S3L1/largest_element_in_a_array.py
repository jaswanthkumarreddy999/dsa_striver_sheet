size = int(input())
arr =  [0]*size
for i in range(0,size):
    arr[i]=int(input())
def le(arr):
    max = arr[0]
    for i in range (1,size):
        if arr[i] > max:
            max = arr[i]
    return max
print("largest element is ",le(arr))