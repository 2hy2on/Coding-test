N = int(input())

arr = [list(map(int, input().strip())) for i in range(N)]

def ans(x,y,n):
    check = True
    for i in range(x,x+n):
        for j in range(y,y+n):
            if arr[i][j] != arr[x][y]:
                check = False
                break
    if check:
        print(arr[x][y],end='')
    else: 
        print("(",end="")
        n//=2
        ans(x,y,n)
        ans(x,y+n,n)
        ans(x+n,y,n)
        ans(x+n,y+n,n)
        print(")",end="")

ans(0,0,N)

