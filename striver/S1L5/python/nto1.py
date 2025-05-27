n = int(input())
def nto1(n):
    print(n)
    if(n==1):
        return
    return nto1(n=n-1)
nto1(n)