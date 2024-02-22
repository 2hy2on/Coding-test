

n, m = map(int, input().split())
chicken=[]
arr = [list(map(int, input().split())) for i in range(n)]
home = []
minDistance = 100000000
temp=[0] * m

for i in range(n):
    for j in range(n):
        if arr[i][j] == 1:
            home.append([i, j])
        elif arr[i][j] == 2:
            chicken.append([i, j])

# print(home)
# 먼저 m개를 고름(조합), 계산함, 최솟값 저장

def chickenDistance(b):
    total = 0
    for i in range(len(home)):
        dist = 100000000000
        for j in range(len(b)):
            dist = min(dist, abs(home[i][0] - chicken[b[j]][0]) + abs(home[i][1]- chicken[b[j]][1]))
        total += dist

    return total

def combination(bucket, bucketSize, itemSize, toPick):
    global minDistance

    if toPick == 0:
        return min(minDistance, chickenDistance(bucket))
    
    lastIndex = bucketSize - toPick -1

    if toPick == bucketSize:
        smallest = 0
    else:
        smallest = bucket[lastIndex] + 1

    for i in range(smallest, itemSize):
        bucket[lastIndex +1] = i
        minDistance = combination(bucket, bucketSize,itemSize, toPick-1)

    return minDistance


print(combination(temp, m,len(chicken), m))