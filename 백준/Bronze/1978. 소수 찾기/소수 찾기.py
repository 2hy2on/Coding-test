size = int(input())

num = [*map(int,input().split())]
primeCnt = 0

def isPrime(num):
    if num == 1: return False
    for i in range(2, num):
        if num % i == 0:
            return False
    return True        


for n in num:
    if isPrime(n) == True:
        primeCnt += 1
print(primeCnt)
