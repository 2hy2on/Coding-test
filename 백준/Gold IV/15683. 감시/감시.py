import copy
from collections import deque

n, m = map(int, input().split())

cctv = deque()
board = []
mode = [
    [],
    [[0],[1],[2],[3]],
    [[0,2], [1,3]],
    [[0,1], [1,2],[2,3],[0,3]],
    [[0,1,2],[0,1,3],[1,2,3],[0,2,3]],
    [[0,1,2,3]]
]
dx = [-1,0,1,0]
dy = [0,1,0, -1]


for i in range(n):
    data = list(map(int, input().split()))
    board.append(data)
    for j in range(m):
        if data[j] in [1,2,3,4,5]:
            cctv.append([data[j], i, j])
    


def fill(board, mode, x, y): #해당 CCTV의 종류에서 바라보는 방향에 따라 감시할 수 있는 곳은 다 -1로 변환시켜 감시하고, 만약 벽을 만나거나 범위를 넘는 곳을 탐색하면 while 문을 빠져 나와 감시를 종료한다.
    for i in mode:
        nx = x
        ny = y
        while True:
            nx += dx[i]
            ny += dy[i]
            if nx < 0 or ny < 0 or nx >= n or ny >= m:
                break
            # 벽
            if board[nx][ny] == 6 :
                break
            elif board[nx][ny] == 0:
                board[nx][ny] = -1


# 잘 못 된 풀이
# def dfs(arr):
#     global min_val

#     # 큐에 없으면
#     if not cctv: 
#         count = 0
#         for i in range(n):
#             count += arr[i].count(0)
#         min_val = min(min_val, count)
#         print(min_val)
#         return
        
#     temp = copy.deepcopy(arr)
#     cctv_num, x, y = cctv.popleft()
#     print(cctv)
#     for i in mode[cctv_num]:
#         fill(temp, i,x,y)
#         dfs(temp)
#         temp = copy.deepcopy(arr)


def dfs(depth, arr):
    global min_val

    if depth == len(cctv):
        count = 0
        for i in range(n):
            count += arr[i].count(0)
        min_val = min(min_val, count)
        return
    # print(cctv)
    temp = copy.deepcopy(arr)
    cctv_num, x, y = cctv[depth]
    for i in mode[cctv_num]:
        fill(temp, i, x, y)
        dfs(depth+1, temp)
        temp = copy.deepcopy(arr)


min_val = int(1e9)
dfs(0, board)
print(min_val)

