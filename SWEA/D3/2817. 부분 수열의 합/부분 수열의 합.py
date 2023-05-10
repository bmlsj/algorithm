
t = int(input())

for i in range(1, t+1):

    n, k = map(int, input().split())
    arr = list(map(int, input().split()))
    ans = 0

    def powerset(idx, total):
        global ans
        if total == k:
            ans += 1
            return

        if idx >= n:
            return

        powerset(idx + 1, total + arr[idx])
        powerset(idx + 1, total)

    powerset(0, 0)
    print(f"#{i} {ans}")