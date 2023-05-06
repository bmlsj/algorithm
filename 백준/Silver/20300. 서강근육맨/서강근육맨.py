import sys
input = sys.stdin.readline


n = int(input())

muscle = list(map(int, input().split()))
muscle.sort()

ans = []

if n % 2:
    ans.append(muscle[-1])
    muscle.pop()
    for i in range(n // 2):
        ans.append(muscle[i] + muscle.pop())
        
    print(max(ans))

else:
    for i in range(n // 2):
        ans.append(muscle[i] + muscle.pop())

    print(max(ans))
