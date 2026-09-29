# Triangular Number Function
def T(n: int) -> int:
    return int((n * (n + 1)) / 2)

def count_divisors(n: int) -> int:
    if n == 1: return 1
    count = 2
    i = 2
    while (i * i <= n):
        if n % i == 0:
            count += 1
            if i * i != n:
                count += 1
        i += 1
    return count

n = 1
c = 0

while (c < 500):
    c = count_divisors(n)
    print(n, c)
    n += 1

print(n)
