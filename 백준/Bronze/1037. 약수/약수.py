count = int(input()) # 개수
num = list(map(int, input().split())) #A 약수

max = max(num)
min = min(num)

print(min * max)