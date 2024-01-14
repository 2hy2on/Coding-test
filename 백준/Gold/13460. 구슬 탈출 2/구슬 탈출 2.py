from collections import deque
 

n, m = map(int, input().split())
board = [list(input().strip()) for i in range(n)]
visit = [[[[0] * m for i in range(n)] for j in range(m)] for k in range(n)]
queue = deque()

# 빨강, 파랑, 구멍 순
rx, ry, bx, by = 0, 0, 0, 0
for i in range(n):
    for j in range(m):
        if board[i][j] == 'R':
            rx, ry = i, j
        elif board[i][j] == 'B':
            bx, by = i, j

# 빨간좌표, 파란좌표, 몇 번째 기울이는건지
queue.append([rx, ry, bx, by, 1])
visit[rx][ry][bx][by] = 1

def move(x,y, dx, dy):
    count=0
    #다음 이동하는 벽이 구멍이 아니거나 #이 아닐때까지
    while board[x+dx][y+dy] != '#' and board[x][y] !='O':
        x +=dx
        y+= dy
        count+=1
    
    return x, y, count

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def bfs():
    while queue:
        rx,ry, bx,by, cnt = queue.popleft()
        if cnt > 10:
            break
        for i in range(4):
            # 기울였을때 끝까지 간 상태를 나타냄
            nrx, nry, r_cnt = move(rx, ry, dx[i], dy[i])
            nbx, nby, b_cnt = move(bx, by, dx[i], dy[i])

              # 파란 구슬이 구멍에 떨어지면
            if board[nbx][nby] == 'O':
                continue
            # 성공조건
            if board[nrx][nry] == 'O':
                print(cnt)
                return
            # 둘이 겹쳐있을경우 더 많이 이동한녀석을 1칸 뒤로 물려줌
            if nrx == nbx and nry == nby:
                if r_cnt > b_cnt:
                    nrx -= dx[i]
                    nry -= dy[i]
                else:
                    nbx -= dx[i]
                    nby -= dy[i]
            if visit[nrx][nry][nbx][nby] == 0:
                visit[nrx][nry][nbx][nby] = 1
                queue.append([nrx, nry, nbx, nby, cnt + 1])

    print(-1)
    return

bfs()
