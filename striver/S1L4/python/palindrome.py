def is_palindrome(num):
    """
    Check if a number is palindrome
    Example: 121 -> True, 123 -> False
    """
    original = num
    reversed_num = 0
    while num > 0:
        digit = num % 10
        reversed_num = reversed_num * 10 + digit
        num //= 10
    return original == reversed_num

if __name__ == "__main__":
    num = int(input("Enter a number: "))
    if is_palindrome(num):
        print(f"{num} is a palindrome")
    else:
        print(f"{num} is not a palindrome") 