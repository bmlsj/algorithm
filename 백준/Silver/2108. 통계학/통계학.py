import sys
input = sys.stdin.readline

n = int(input())
num = []
for _ in range(n):
    num.append(int(input()))

# 산술평균
print(round(sum(num) / n))

# 중앙값
num.sort()
print(num[n // 2])

# 최빈값
num_dict = {i: 0 for i in num}
for v in num:
    num_dict[v] += 1
num_dict = sorted(num_dict.items(), key=lambda t: -t[1])

if len(num_dict) == 1:
    print(num_dict[0][0])
elif len(num_dict) >= 2 and num_dict[0][1] == num_dict[1][1]:
    print(num_dict[1][0])
else:
    print(num_dict[0][0])
    
# 범위
print(max(num) - min(num))
