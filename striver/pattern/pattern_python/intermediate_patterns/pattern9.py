n = int(input())

# Upper half of diamond
for i in range(1, n + 1):
    # Print spaces
    for j in range(n - i, 0, -1):
        print(" ", end="")
    # Print stars
    for k in range(2 * i - 1, 0, -1):
        print("*", end="")
    print()

# Lower half of diamond
for i in range(n, 0, -1):
    # Print spaces
    for j in range(n - i):
        print(" ", end="")
    # Print stars
    for k in range(2 * i - 1):
        print("*", end="")
    print() 