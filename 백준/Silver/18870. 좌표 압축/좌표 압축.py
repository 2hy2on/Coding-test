n = int(input())
a = list(map(int, input().split()))

b = list(sorted(set(a)))
dic = dict()

for i in range(len(b)):
    dic[b[i]] = i

for i in a:
    print(dic[i], end=' ')



# N = int(input())

# nums = list(map(int, input().split()))

# numsDul = sorted(set(nums))

# for i in nums:
#     print(numsDul.index(i), end=" ")



# 이와 같이 하면 O(n)이 걸리기 때문에 시간초과가 발생한다.
# res = []

# for i in range(len(nums)):
#     cnt = 0
#     for j in range(len(numSet)):
#         if nums[i] > numSet[j]:
#             cnt += 1
#     res.append(cnt)

# for i in res:
#     print(i, end=" ")
