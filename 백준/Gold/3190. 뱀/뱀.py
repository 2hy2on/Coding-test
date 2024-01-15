from collections import deque

apple=[]
dirX=[0,1,0,-1]
dirY =[1,0,-1, 0] 
dir =[]
# snake=[]
snake = deque()

N = int(input())
k = int((input()))

for i in range(k):
    x, y = map(int,input().split())
    apple.append((x,y))

dirChangeCnt = int(input())

for i in range(dirChangeCnt):
    numStr, d = input().split()
    num = int(numStr)
    dir.append((num, d))

currentX, currentY = 1, 1
snake.append((currentX, currentY))
dirXIdx = 0
dirYIdx = 0

nextX = currentX + dirX[dirXIdx]
nextY = currentY + dirY[dirYIdx]

#초 카운팅
sec = 1

while nextX > 0 and nextX <= N and nextY >0 and nextY <=N: #벽에 부딪힘
    if (nextX, nextY) in snake: break # 몸에 닿음
    if (nextX, nextY) not in apple:
        snake.pop() #꼬리 없애기
    else:
        apple.remove((nextX, nextY)) 
    snake.appendleft((nextX, nextY)) #머리 늘리기

    ##방향 확정
    for t, d in dir:
        if sec == t:
            if d == 'D':
                dirXIdx = (dirXIdx + 1) % 4
                dirYIdx = (dirYIdx + 1) % 4
                break
            else:
                dirXIdx = (dirXIdx - 1) % 4
                dirYIdx = (dirYIdx - 1) % 4
                break
    nextX += dirX[dirXIdx]
    nextY += dirY[dirYIdx]
    sec +=1

print(sec)