n, m, v = map(int, input().split())
picked = [False for _ in range(n + 1)]
queue = []
stack= []
edge = []
for i in range(m):
    a, b = map(int, input().split())
    edge.append((a, b))

def find_different_edge(vertex, edges):
    different_edges = []
    for edge in edges:
        if vertex in edge:
            if edge[0] == vertex:
                different_edges.append(edge[1])
            else:
                 different_edges.append(edge[0])
    return different_edges


stack.append(v)
while stack:
    current_vertex = stack.pop()
    if not picked[current_vertex] :
        picked[current_vertex]  = True
        print(current_vertex, end=' ')

    different_edges = sorted(find_different_edge(current_vertex, edge), reverse=True)
    for i in different_edges:
        if not picked[i]:
            stack.append(i)

# 초기화

picked = [False for _ in range(n + 1)]

queue.append(v)
print()
while queue:
    
    current_vertex = queue.pop(0)
    if not picked[current_vertex]:
        picked[current_vertex]  = True
        print(current_vertex, end=' ')
    
    different_edges = sorted(find_different_edge(current_vertex, edge))

    for i in different_edges:
        if not picked[i]:
            queue.append(i)