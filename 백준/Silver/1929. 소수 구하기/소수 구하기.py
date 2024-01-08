import math

start, end = map(int, input().split())

checkPrime = [1] * (end +1)

def isPrime(num):
    if num == 1: return False
    for i in range(2, num):
        if num % i == 0:
            return False
    return True 
    
sqr_range = int(math.sqrt(end))
for n in range(1, sqr_range + 1):
    if isPrime(n) == True:
        i = 2
        while i * n < end + 1:
            checkPrime[n * i] = 0
            i += 1
    else:
        checkPrime[n] = 0

for n in range(start, end+1):
    if(checkPrime[n] == 1):
      print(n)
