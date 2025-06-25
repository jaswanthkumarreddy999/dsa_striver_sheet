def rotate(arr):
    temp = arr[0]
    for i in range(1,size):
        arr[i-1]=arr[i]
    arr[size-1]=temp
    
size = int(input())
arr = [0]*size
for i in range(0,size):
    arr[i] = int(input())
for i in range(0,size):
    print(arr[i],end=" ")
print()
rotate(arr)
for i in range(0,size):
    print(arr[i],end=" ")
