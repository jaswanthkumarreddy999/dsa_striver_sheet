n = int(input())
for i in range(1, n + 1):
    # Print spaces
    for j in range(1, n - i + 1):
        print(" ", end="")
    # Print increasing letters
    for k in range(1, i + 1):
        print(chr(k + 64), end="")
    # Print decreasing letters
    for l in range(i - 1, 0, -1):
        print(chr(l + 64), end="")
    print() 