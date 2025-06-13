size = int(input())
arr = [0]*size
for i in range(0,size):
    arr[i]=int(input())
def rinsertion_sort(arr,i):
    if i == len(arr):
        return
    j=i
    while j>=1 and arr[j-1]>=arr[j]:
        temp = arr[j]
        arr[j] = arr[j-1]
        arr[j-1] = temp
        j-=1
    rinsertion_sort(arr,i+1)
rinsertion_sort(arr,1)
for i in range(0,size):
        print(arr[i],end=" ")