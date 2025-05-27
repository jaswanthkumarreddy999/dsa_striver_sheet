n = int(input())
i = int(0)
def pr(i):
    print(i)
    if(i==n):
        return
    return pr(i=i+1)
print(pr(i))
