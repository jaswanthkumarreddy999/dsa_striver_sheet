size = int(input())
arr = [0]*size
for i in range(0,size):
    arr[i]=int(input())
def rbs(arr,size):
    if size==1 :
        return
    for j in range(0,size-1):
        if arr[j]>=arr[j+1]:
            temp = arr[j]
            arr[j] = arr[j+1]
            arr[j+1] = temp
    rbs(arr,size-1)
rbs(arr,size)
for i in range(0,size):
        print(arr[i],end=" ")