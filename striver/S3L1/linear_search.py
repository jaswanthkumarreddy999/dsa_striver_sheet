size = int(input())
arr = [0]*size
for i in range(0,size):
    arr[i]=int(input())
key = int(input())
def linearSearch(arr,key):
    for i in range(0,len(arr)):
        if key == arr[i]:
            print("key found at index ",i)
            return
    print("key is not resent in the array")
    
linearSearch(arr,key)