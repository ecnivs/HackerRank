# Staircase
def staircase(n):
    i = 1
    while i <= n:
        print(" "*(n-i),"#" * i,sep="")
        i+=1

if __name__ == '__main__':
    n = int(input().strip())
    staircase(n)
