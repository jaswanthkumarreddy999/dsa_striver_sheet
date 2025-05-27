def is_armstrong(num):
    """
    Check if a number is Armstrong number
    Armstrong number is a number that is equal to the sum of its own digits raised to the power of the number of digits
    Example: 153 (1^3 + 5^3 + 3^3 = 153) -> True
    """
    original_num = num
    num_digits = len(str(num))
    sum_of_powers = 0
    
    while num > 0:
        digit = num % 10
        sum_of_powers += digit ** num_digits
        num //= 10
    
    return sum_of_powers == original_num

if __name__ == "__main__":
    num = int(input("Enter a number: "))
    if is_armstrong(num):
        print(f"{num} is an Armstrong number")
    else:
        print(f"{num} is not an Armstrong number") 