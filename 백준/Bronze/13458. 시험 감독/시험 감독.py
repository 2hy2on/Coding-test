import math

count = int(input())

arr = list(map(int, input().split()))

watch =list(map(int, input().split()))

total = count

for i in range(count):
    if arr[i] > watch[0]:
        total += math.ceil((arr[i] - watch[0]) / watch[1])

print(total)