N, L = map(int, input().split())

lists = []
answer = 0

for i in range(N):
    lists.append(list(map(int, input().split())))


# 가로
for i in range(N):
    before = lists[i][0]
    sameHeight = 1 ##경사로를 놓기 위해 같은 높이인 개수 조사
    for j in range(1,N):
        if lists[i][j] == before:
            sameHeight += 1
            before = lists[i][j]
        elif lists[i][j]-before==1 and sameHeight >= 0:
            # 커졌을 때, sameHeight가 L보다 커야, 반대쪽 경사로를 놓을 수 있기 때문에 아래 조건문 추가
            if sameHeight >= L: 
                sameHeight = 1
                before = lists[i][j]
            else:
                break
        elif lists[i][j]-before==-1 and sameHeight >= 0:
            # 작아졌을 때, sameHeight >= 0이면 경사로 1개 놓을 수 있는 것이므로 일단 sameHeight 값 초기화
            sameHeight = - L + 1 
            before = lists[i][j]
        else:
            break
    else:
        if sameHeight >= 0:
            answer += 1
 
# 세로
for j in range(N):
    before = lists[0][j]
    sameHeight = 1
    for i in range(1,N):
        if lists[i][j] == before:
            sameHeight += 1
            before = lists[i][j]
        elif lists[i][j]-before==1 and sameHeight >= 0:
            # 커졌을 때, sameHeight가 L보다 커야, 반대쪽 경사로를 놓을 수 있기 때문에 아래 조건문 추가
            if sameHeight >= L:
                sameHeight = 1
                before = lists[i][j]
            else:
                break
        elif lists[i][j]-before==-1 and sameHeight >= 0:
            # 작아졌을 때, sameHeight >= 0이면 경사로 1개 놓을 수 있는 것이므로 일단 sameHeight 값 초기화
            sameHeight = - L + 1
            before = lists[i][j]
        else:
            break
    else:
        if sameHeight >= 0:
            answer += 1
print(answer)