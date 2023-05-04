n = int(input())
INF = 1000000


def is_prime(n):
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

ans = 0
for i in range(n, INF+1):
    if i == 1:
        continue
        
    if is_prime(i):
        num = str(i)
        if num == num[::-1]:
            ans = int(num)
            break

if ans == 0:     # 입력값이 최대 값 100만일 경우
    ans = 1003001    # 100만 이상이면서 팰림드롬 및 소수일 경우를 적용

print(ans)