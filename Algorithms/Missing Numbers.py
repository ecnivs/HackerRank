# Missing Numbers
from collections import Counter
import os

def missingNumbers(arr, brr):
    count_arr = Counter(arr)
    count_brr = Counter(brr)

    missing = []

    for num in count_brr:
        if count_brr[num] > count_arr.get(num, 0):
            missing.append(num)
    return sorted(missing)

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')
    n = int(input().strip())
    arr = list(map(int, input().rstrip().split()))
    m = int(input().strip())
    brr = list(map(int, input().rstrip().split()))
    result = missingNumbers(arr, brr)
    fptr.write(' '.join(map(str, result)))
    fptr.write('\n')
    fptr.close()
