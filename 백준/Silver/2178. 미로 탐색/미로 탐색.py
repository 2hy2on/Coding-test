n, m = map(int, input().split())
queue = []
maze = []
visited = [[0] * m for _ in range(n)]


for i in range (n):
    line = []
    for j in map(int, input()):
        line.append(j)
    maze.append(line)

x = 1
y = 1

visited[0][0] = 1
queue.append((x-1, y-1))

while queue:
    x, y = queue.pop(0)

    if x + 1 < n and maze[x+1][y] == 1 and visited[x+1][y] == 0: #아래
        visited[x+1][y] = visited[x][y] + 1
        queue.append((x+1, y))
    if y + 1 < m and maze[x][y+1] == 1 and visited[x][y +1] == 0: # 오른쪽
        visited[x][y+1] = visited[x][y]+ 1
        queue.append((x, y +1))
    if x -1 >= 0 and maze[x-1][y] == 1 and visited[x-1][y] == 0: # 위
        visited[x-1][y] = visited[x][y]+ 1
        queue.append((x-1, y))
    if y-1 >= 0 and maze[x][y-1] == 1 and visited[x][y-1] == 0: # 왼
        visited[x][y-1] = visited[x][y]+ 1
        queue.append((x, y -1))

print(visited[n -1][m -1])