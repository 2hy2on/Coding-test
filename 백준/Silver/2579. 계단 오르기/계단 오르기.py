N = int(input())
# dp에 사용할 배열과 각 계단에 저장할 값을 선언
dp = [0] * (N+1)
point = [0] * (N+1)
for i in range(1, N+1):
    point[i] = int(input())
if N==1:
    print(point[1])
    exit()
elif N==2:
    print(sum(point[:3]))  # 계단이 2개 이하일땐 그냥 다 더해서 출력
    exit()
dp[1] = point[1]
dp[2] = point[1]+point[2]
for i in range(3, N+1):
            # 연속되지 않게 i번째 계단에 도착할 경우
        # i번째 계단과 i-1번째 계단이 연속될 경우
    dp[i] = max(dp[i-2]+point[i], dp[i-3]+point[i-1]+point[i])

print(dp[-1])