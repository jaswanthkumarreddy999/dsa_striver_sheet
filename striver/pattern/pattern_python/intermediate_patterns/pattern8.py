n = int(input())
for i in range(n, 0, -1):
    # Print spaces
    for j in range(n - i):
        print(" ", end="")
    # Print stars
    for k in range(2 * i - 1):
        print("*", end="")
    print() 