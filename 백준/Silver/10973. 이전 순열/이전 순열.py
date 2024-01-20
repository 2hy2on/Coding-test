def pre_permutation(arr):
    i = len(arr) - 1

    while i > 0 and arr[i] > arr[i - 1]:
        i -= 1

    if i == 0:
        return False

    j = len(arr) - 1
    while arr[i - 1] < arr[j]:
        j -= 1
    arr[i - 1], arr[j] = arr[j], arr[i - 1]

    j = len(arr) - 1
    while i < j:
        arr[i], arr[j] = arr[j], arr[i]
        i += 1
        j -= 1

    return True


def main():
    N = int(input())
    arr = list(map(int, input().split()))

    if pre_permutation(arr):
        print(*arr)
    else:
        print(-1)


if __name__ == "__main__":
    main()
