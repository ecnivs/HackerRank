# Sherlock and Array
n = int(input())

for _ in range(0,n):
    n2 = int(input())
    nl = list(map(int, input().split(" ")))
    result = 'NO'
    for i in range(0,n2):
        lsum = sum(nl[0:i])
        rsum = sum(nl[i+1: ])
        if lsum == rsum:
            result = 'YES'
            break
    print(result)
