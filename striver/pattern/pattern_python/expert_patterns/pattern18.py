n = int(input())
for i in range(1, n + 1):
    for j in range(n - i + 1, n + 1):
        print(chr(j + 64), end="")
    print() 