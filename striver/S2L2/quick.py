size = int(input())
arr = [0]*size
for i in range(0,size):
    arr[i]=int(input())
# def fixedpoint(arr,l,r):
#     narr = [0]*len(arr)
#     temp = arr[l]
#     lp = l
#     rp = r
#     for i in range(l+1,r+1):
#         if temp >= arr[i]:
#             narr[lp] = arr[i]
#             lp+=1
#         else:
#             narr[rp] = arr[i]
#             rp-=1
#     narr[lp] = temp
#     for i in range(l,r+1):
#         arr[i]=narr[i]
#     return lp
def fixedpoint(arr,l,r):
    temp = arr[l]
    lp = l+1
    rp = r
    while lp<rp :
            while lp<rp and temp>=arr[lp]:
                lp+=1
            while temp < arr[rp] :
                rp-=1
            if lp<rp:
                t = arr[lp]
                arr[lp] = arr[rp]
                arr[rp] =t
    arr[l] = arr[rp]
    arr[rp] = temp
    return rp       
def quick_sort(arr,l,r):
    if l<r:
        pi = fixedpoint(arr,l,r)
        quick_sort(arr,l,pi-1)
        quick_sort(arr,pi+1,r)
        
quick_sort(arr,0,size-1)
for i in range(0,size):
        print(arr[i],end=" ")