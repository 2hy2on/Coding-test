n = int(input())
stair = [0] * (n+1)
dp=[0] * (n+1)
for i in range(1, n+1):
    stair[i] = int(input())

if len(stair)<=2: # 계단이 2개 이하일땐 그냥 다 더해서 출력
    print(sum(stair))

else:
    dp[1]=stair[1] # 첫째 계단 수동 계산
    dp[2]=stair[1]+stair[2] # 둘째 계단까지 수동 계산
    for i in range(3, n+1):
        # 연속되지 않게 i번째 계단에 도착할 경우
        # i번째 계단과 i-1번째 계단이 연속될 경우
        dp[i] = max(dp[i-2]+stair[i], dp[i-3]+stair[i-1]+stair[i])
    print(dp[-1])

# 너무 일반화하려함, 경우의 수를 차근히 살펴보고 구하기