from collections import deque
n = int(input())
arr=[]
for _ in range(n):
    row= input().strip()
    temp=[]
    for digit in row:
        temp.append(int(digit))
    arr.append(temp)

visited = [[0] * n for _ in range(n)] 

stack = deque()

dx = [-1, 0, 1, 0]
dy = [0,1,0, -1]
danji = 1
for i in range(n):
   for j in range(n):
        if visited[i][j] == 0 and arr[i][j] != 0:
            stack.append([i, j])
            visited[i][j] = danji
            while stack:
                x, y = stack.pop()
                for k in range(4):
                    newX = x + dx[k]
                    newY = y + dy[k]
                    if newX >= 0 and newX < n and newY>=0 and newY < n and arr[newX][newY] != 0 and visited[newX][newY] == 0:
                        stack.append([newX, newY])
                        visited[newX][newY] = danji
            danji+=1


danji -=1
danjiCnt = [0] * (danji+1)
for i in range(1, danji+1):
    cnt = 0
    for a in visited:
        cnt += a.count(i)
    danjiCnt[i] = cnt

danjiCnt =sorted(danjiCnt)

print(danji)
for i in range(1, danji+1):
    print(danjiCnt[i])