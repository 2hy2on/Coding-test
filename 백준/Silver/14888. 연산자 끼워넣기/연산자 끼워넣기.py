N = int(input())

nums = list(map(int, input().split()))

operNum = list(map(int, input().split()))

oper = ['+', '-', '*', '//']
newOper = ['+'] * operNum[0] + ['-'] * operNum[1] + ['*'] * operNum[2] + ['//'] * operNum[3]
bucket = [-1] * sum(operNum)

# 전역 변수로 선언
min_val = 10000000000
max_val = -10000000000

##순열
def sol(bucket, bucketSize, k):
    global min_val, max_val  # 전역 변수 사용 선언

    if k == 0:
        res = nums[0]
        for i in range(bucketSize):
            if newOper[bucket[i]] == '+':
                res = res + nums[i+1]
            elif newOper[bucket[i]] == '-':
                res = res - nums[i+1]
            elif newOper[bucket[i]]== '*':
                res = res * nums[i+1]
            else:
                if res < 0:
                    res = -1 * res // nums[i+1]
                    res = -1 * res
                else:
                    res = res // nums[i+1]
        
        if min_val > res:
            min_val = res
        if max_val < res:
            max_val = res
        return
    
    lastIndex = bucketSize - k - 1
    smallest = 0
    for i in range(smallest, bucketSize):
        chosen = 0
        for j in range(lastIndex +1):
            if bucket[j] == i:
                chosen = 1
                break
        if chosen == 0:
            bucket[lastIndex + 1] = i
            sol(bucket, bucketSize, k - 1)

     
    

sol(bucket, sum(operNum), sum(operNum))
print(max_val)
print(min_val)
