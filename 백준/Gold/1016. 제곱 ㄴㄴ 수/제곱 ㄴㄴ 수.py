def prime_list(a, b):
    # 에라토스테네스의 체 초기화: n개 요소에 True 설정(소수로 간주)
    sieve = [True] * (b - a + 1)
    ans = b - a + 1
    # n의 최대 약수가 sqrt(b) 이하이므로 i=sqrt(b)까지 검사
    for i in range(2, int(b ** 0.5 + 1)):
        for j in range((((a - 1) // (i * i)) + 1) * (i * i), b + 1, (i * i)):  # i이후 i의 배수들을 False 판정
            if sieve[j - a]:  # i가 소수인 경우
                sieve[j - a] = False
                ans -= 1

    # 소수ㄴㄴ 목록 산출
    return ans


a, b = map(int, input().split())
print(prime_list(a, b))
