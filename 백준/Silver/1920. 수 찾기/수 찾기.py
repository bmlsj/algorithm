def binary_search(target, data, start, end):
    if start > end:
        return 0

    mid = (start + end) // 2

    if data[mid] == target:
        return 1
    elif data[mid] > target:
        end = mid - 1
    else:
        start = mid + 1

    return binary_search(target, data, start, end)


n = int(input())
nlist = set(map(int, input().split()))
nlist = sorted(nlist)

m = int(input())
mlist = list(map(int, input().split()))

for i in mlist:
    print(binary_search(i, nlist, 0, len(nlist)-1))