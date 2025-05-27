def reverse_number(num):
    """
    Reverse a given number
    Example: 1234 -> 4321
    """
    reversed_num = 0
    while num > 0:
        digit = num % 10
        reversed_num = reversed_num * 10 + digit
        num //= 10
    return reversed_num

def is_palindrome(num):
    """
    Check if a number is palindrome
    Example: 121 -> True, 123 -> False
    """
    return num == reverse_number(num)

def gcd(a, b):
    """
    Find Greatest Common Divisor (GCD) or Highest Common Factor (HCF)
    Example: gcd(12, 18) -> 6
    """
    while b:
        a, b = b, a % b
    return a

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

def print_divisors(num):
    """
    Print all divisors of a number
    Example: 12 -> 1, 2, 3, 4, 6, 12
    """
    divisors = []
    for i in range(1, int(num ** 0.5) + 1):
        if num % i == 0:
            divisors.append(i)
            if i != num // i:  # Avoid duplicate for perfect squares
                divisors.append(num // i)
    return sorted(divisors)

def is_prime(num):
    """
    Check if a number is prime
    Example: 17 -> True, 20 -> False
    """
    if num <= 1:
        return False
    if num <= 3:
        return True
    if num % 2 == 0 or num % 3 == 0:
        return False
    
    i = 5
    while i * i <= num:
        if num % i == 0 or num % (i + 2) == 0:
            return False
        i += 6
    return True

# Example usage
if __name__ == "__main__":
    # Test reverse number
    print("Reverse of 1234:", reverse_number(1234))
    
    # Test palindrome
    print("Is 121 palindrome?", is_palindrome(121))
    print("Is 123 palindrome?", is_palindrome(123))
    
    # Test GCD
    print("GCD of 12 and 18:", gcd(12, 18))
    
    # Test Armstrong
    print("Is 153 Armstrong?", is_armstrong(153))
    print("Is 123 Armstrong?", is_armstrong(123))
    
    # Test divisors
    print("Divisors of 12:", print_divisors(12))
    
    # Test prime
    print("Is 17 prime?", is_prime(17))
    print("Is 20 prime?", is_prime(20)) 