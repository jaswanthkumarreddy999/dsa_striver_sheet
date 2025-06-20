size = int(input())
arr = [0]*size
for i in range(0,size):
    arr[i] = int(input())
def sle(arr):
    m1 = arr[0]
    m2 = arr[0]
    for i in range (1,size):
        if(arr[i]>m1):
            m2=m1
            m1=arr[i]
        elif (arr[i]>m2):
            m2 = arr[i]
    print("largest element is ",m1," Second largest element is ",m2)
sle(arr)