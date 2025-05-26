n = int(input())
for i in range(1, n + 1):
    a = ord('A')
    for j in range(1, i + 1):
        print(chr(a), end="")
        a += 1
    print() 