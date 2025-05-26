n = int(input())
a = ord('A') - 1
for i in range(n, 0, -1):
    a += 1
    for j in range(1, i + 1):
        print(chr(a), end="")
    print() 