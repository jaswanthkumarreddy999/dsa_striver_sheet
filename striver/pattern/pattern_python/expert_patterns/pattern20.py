n = int(input())

# Upper half
for i in range(1, n + 1):
    # Print stars
    for j in range(1, i + 1):
        print("*", end="")
    # Print spaces
    for k in range((n - i) * 2):
        print(" ", end="")
    # Print stars
    for m in range(1, i + 1):
        print("*", end="")
    print()

# Lower half
for i in range(2, n + 1):
    # Print stars
    for j in range(n, i - 1, -1):
        print("*", end="")
    # Print spaces
    for k in range(3, i * 2 + 1):
        print(" ", end="")
    # Print stars
    for m in range(n, i - 1, -1):
        print("*", end="")
    print() 