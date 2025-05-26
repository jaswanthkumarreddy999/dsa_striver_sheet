n = int(input())
size = 2 * n - 1
arr = [[0 for _ in range(size)] for _ in range(size)]
l, r, t, b = 0, size - 1, 0, size - 1
count = n

while l != r and t != b:
    # Fill top row
    for i in range(l, r + 1):
        arr[t][i] = count
    t += 1
    
    # Fill right column
    for i in range(t, b + 1):
        arr[i][r] = count
    r -= 1
    
    # Fill bottom row
    for i in range(r, l - 1, -1):
        arr[b][i] = count
    b -= 1
    
    # Fill left column
    for i in range(b, t - 1, -1):
        arr[i][l] = count
    l += 1
    
    count -= 1

# Fill center element
arr[t][l] = 1

# Print the pattern
for i in range(size):
    for j in range(size):
        print(arr[i][j], end=" ")
    print() 