A, B = map(int, input().split())


def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)

def lcm(a, b):
    return (a * b) // gcd(a , b)

print(lcm(B,A))  ##a자리에 더 큰 값이 들어가야함