def count_digits_string():
    # Method 1: Using string conversion
    num = input()
    print(len(num))

def count_digits_math():
    # Method 2: Using mathematical operations
    num = int(input())
    digit = 0
    while num != 0:
        digit += 1
        num //= 10
    print(digit)

# Uncomment the method you want to use
# count_digits_string()
count_digits_math() 