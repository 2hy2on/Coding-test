N = int(input())

schedule = [list(map(int, input().split())) for i in range(N)]

dp = [0 for i in range(N+1)]


for i in range(N):
    for j in range(i+schedule[i][0], N+1):
        if dp[j] < dp[i] + schedule[i][1]:
            dp[j] = dp[i] + schedule[i][1]
print(dp[-1])

#"i번째까지 일했을 때 얻는 최대 수익" 을 계산하기 위한 i를 기준으로
# j는 i번째 날에 상담을 진행했을 때 상담가능한 모든 날짜 즉 i+상담 기간 부터 마지막 날까지
# 그리고 j를 기준으로 상담을 진행했을 떄 얻는 최대 수익을 dp[j]에 저장핟도록 한다.

# n = int(input())
# work = []
# picked = []  # 뽑은 거 인덱스 넣기

# for i in range(n):
#     day, pay = map(int, input().split())
#     work.append([day, pay])

# def pick(picked, day):
#     res = 0
#     totalPay = 0

#     if day >= n:
#         for i in picked:
#             totalPay += work[i][1]
#         print(picked)
#         return totalPay
    
#     for i in range(day, n):
#         temp = i
#         # i += work[i][0]
#         i = temp + work[i][0]  # 이 부분을 수정하여 누적되지 않도록 함
#         if i <= n:
#             picked.append(temp)
#             res = max(res, pick(picked, i))
#             picked.pop()
#         if i > n:
#             res = max(res, pick(picked, i))    
#     return res

# print(pick(picked, 0))

