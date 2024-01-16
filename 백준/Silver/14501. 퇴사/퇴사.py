n = int(input())
work = []
picked = []  # 뽑은 거 인덱스 넣기

for i in range(n):
    day, pay = map(int, input().split())
    work.append([day, pay])

def pick(picked, day):
    res = 0
    totalPay = 0

    if day >= n:
        for i in picked:
            totalPay += work[i][1]
        #print(picked)
        return totalPay
    
    for i in range(day, n):
        temp = i
        # i += work[i][0]
        i = temp + work[i][0]  # 이 부분을 수정하여 누적되지 않도록 함
        if i <= n:
            picked.append(temp)
            res = max(res, pick(picked, i))
            picked.pop()
        if i > n:
            res = max(res, pick(picked, i))    
    return res

print(pick(picked, 0))