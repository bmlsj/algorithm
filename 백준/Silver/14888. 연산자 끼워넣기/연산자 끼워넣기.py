
# 연산자는 앞에서부터
# 나눗셈은 정수 나눗셈으로 몫만 취함
# 음수를 양수로 나눌 때, 양수로 바꾼뒤 몫을 구하고 음수로 변환
from itertools import permutations

N = int(input())
num = list(map(int, input().split()))
sign_list = list(map(int, input().split()))
sign = ['+', '-', '*', '/']

op = []

for i in range(len(sign_list)):
    for j in range(sign_list[i]):
        op.append(sign[i])


result = []
for i in permutations(op, N-1):
    calc = num[0]
    for j in range(1, N):
        if i[j-1] == '+':
            calc += num[j]
        elif i[j-1] == '*':
            calc *= num[j]
        elif i[j-1] == '/':
            calc = int(calc/num[j])
        elif i[j-1] == '-':
            calc -= num[j]

    result.append(calc)

print(max(result))
print(min(result))