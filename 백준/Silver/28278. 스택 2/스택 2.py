from collections import deque

n = int(input())
arr= []
for i in range(n):
    arr.append(list(map(int, input().split())))

q = deque()

for i in arr:
    if i[0] == 1:
        q.append(i[1])
    elif i[0] ==2:
        if q:
            print(q.pop())
        else:
            print(-1)
    elif i[0] ==3:
        print(len(q))
    elif i[0] ==4:
        if q:
            print(0)
        else:
            print(1)
    elif i[0] ==5:
        if q:
            print(q[-1])
        else:
            print(-1)
    