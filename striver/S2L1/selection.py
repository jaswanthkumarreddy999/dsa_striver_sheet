size = int(input())
arr = [0]*size
for i in range(0,size):
    arr[i]=int(input())
def selection_sort(arr):
    for i in range(0,size):
        point = int(0) 
        for j in range(0,size-i):
            if arr[j]>arr[point]:
                point = j
        temp = arr[size-i-1] 
        arr[size-i-1] = arr[point]
        arr[point] = temp
        # for i in range(0,size):
        #     print(arr[i],end=" ")
        # print()
selection_sort(arr) 
for i in range(0,size):
        print(arr[i],end=" ")
