size = int(input())
arr = [0]*size
for i in range(0,size):
    arr[i]=int(input())
def bubble_sort(arr):
    for i in range(0,size-1):
        for j in range(0,size-1-i):
            if arr[j] > arr[j+1]:
                temp = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = temp
            for i in range(0,size):
                print(arr[i],end=" ")
            print()
bubble_sort(arr)
for i in range(0,size):
        print(arr[i],end=" ")
            