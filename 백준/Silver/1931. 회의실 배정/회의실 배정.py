
n = int(input())

time = []
for _ in range(n):
    time.append(list(map(int, input().split())))

time = sorted(time, key=lambda a: a[0])  # 시작 시간을 기준으로 오름차순
time = sorted(time, key=lambda a: a[1])  # 끝나는 시간을 기준으로 다시 오름차순

last, count = 0, 0  # last : 회의의 마지막 시간을 저장 / count : 회의실을 사용하는 회의 개수

for i, j in time:
    if i >= last:   # 시작 시간이 회의 마지막 시간보다 크거나 같을 경우
        count += 1
        last = j

print(count)
