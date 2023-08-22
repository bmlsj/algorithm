import sys
input = sys.stdin.readline

n, k = map(int, input().split())
heights = list(map(int, input().split()))


def diff(heights):
    diff_list = []

    for i in range(len(heights) - 1):
        diff_list.append(heights[i + 1] - heights[i])

    diff_list.sort()
    return diff_list


print(sum(diff(heights)[:n-k]))
