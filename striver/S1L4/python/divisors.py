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

if __name__ == "__main__":
    num = int(input("Enter a number: "))
    divisors = print_divisors(num)
    print(f"Divisors of {num} are: {divisors}") 