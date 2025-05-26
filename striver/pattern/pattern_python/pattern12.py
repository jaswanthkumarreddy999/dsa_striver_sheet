n = int(input())
for i in range(1, n + 1):
    # Print increasing numbers
    for j in range(1, i + 1):
        print(j, end="")
    # Print spaces
    for k in range((n - i) * 2):
        print(" ", end="")
    # Print decreasing numbers
    for l in range(i, 0, -1):
        print(l, end="")
    print() 