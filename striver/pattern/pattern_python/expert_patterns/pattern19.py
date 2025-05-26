n = int(input())

# Upper half
for i in range(1, n + 1):
    # Print stars
    for j in range(1, n - i + 2):
        print("*", end="")
    # Print spaces
    for k in range(2 * (i - 1)):
        print(" ", end="")
    # Print stars
    for l in range(1, n - i + 2):
        print("*", end="")
    print()

# Lower half
for i in range(1, n + 1):
    # Print stars
    for j in range(1, i + 1):
        print("*", end="")
    # Print spaces
    for k in range(2 * (n - i)):
        print(" ", end="")
    # Print stars
    for l in range(1, i + 1):
        print("*", end="")
    print() 