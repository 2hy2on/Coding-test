n = int(input())
length = list(map(int, input().split()))

dp = [1] * n

for i in range(1, n):
    for j in range(i):
        if length[j] < length[i]:
            dp[i] = max(dp[i], dp[j] + 1)

print(max(dp))
