import sys

input = sys.stdin.readline

urim = list(map(int, input().split()))
startlink = list(map(int, input().split()))

urim_score, startlink_score = 0, 0
win = False

for i in range(9):
    urim_score += urim[i]

    if urim_score > startlink_score:
        win = True

    startlink_score += startlink[i]

print("Yes" if win else "No")
