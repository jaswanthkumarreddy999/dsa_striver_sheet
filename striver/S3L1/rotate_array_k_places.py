class Solution(object):
    def rotate(self, arr, k):
        for j in range(0,k):
            temp = arr[len(arr)-1]
            for i in range(len(arr)-2,-1,-1):
                arr[i+1]=arr[i]
            arr[0]=temp