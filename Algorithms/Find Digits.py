# Find Digits
def is_divisor(n, d):
    return d != 0 and n % d == 0

n = int(input())
nl = []
for i in range(n):
    nl.append(int(input()))

for num in nl:
    digits = [int(digit) for digit in str(num)]
    count = sum(1 for d in digits if is_divisor(num, d))
    print(count)

