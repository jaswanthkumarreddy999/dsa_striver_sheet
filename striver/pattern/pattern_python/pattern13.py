n = int(input())
pin = 1
for i in range(1, n + 1):
    for j in range(1, i + 1):
        print(pin, end=" ")
        pin += 1
    print() 