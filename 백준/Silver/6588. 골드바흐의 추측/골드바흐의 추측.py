import sys

primeList = [1] * 1000001

def isPrime(x):
    if x == 1: return False
    for i in range(2, x):
        if x % i == 0:
            return False
    return True

def findSum(x):
    for i in range(3, x) :
        j = x - i
        if(primeList[j] == 1 and primeList[i] == 1):
            print("%d = %d + %d" %(x, i, j))
            return
    print("Goldbach's conjecture is wrong.")


for n in range(1, 1001):
    if isPrime(n) == True: ## 사실이면
        for j in range(n + n, 1000001, n):
            primeList[j] = 0

while True:
    n = int(sys.stdin.readline())
    if n == 0:
        break  # 0을 입력하면 루프를 종료
    findSum(n)
    