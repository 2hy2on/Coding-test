m, n = map(int, input().split())

arr = list(map(int, input().split()))

right = max(arr)

def sol(left, right):
    result = 0
    while left <= right:
        mid = (left + right) // 2 #자른거
        
        cnt = 0
        for i in arr:
            if i >= mid:
                cnt += i // mid
        if cnt >= m: # 같다를 추가해준 이유는 무한 루프를 벗어나기 위해
            left = mid +1
        elif cnt < m:
            right = mid -1
    return right
    
print(sol(1, right))