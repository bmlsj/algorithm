# n개 끊어짐, 브랜드 m개
n, m = map(int, input().split())
price = [list(map(int, input().split())) for _ in range(m)]
ans = 0

package = sorted(price)
single = sorted(price, key=lambda t: t[1])

if single[0][1] * 6 >= package[0][0]:
    # 13일 경우, 12개는 패키지 1개는 낱개로 구매
    ans = package[0][0] * (n // 6) + single[0][1] * (n % 6)
    # 패키지 구매가 낱개구매보다 저렴할 경우 
    if package[0][0] < single[0][1] * (n % 6):
        ans = package[0][0] * (n // 6 + 1)
else:
    ans = single[0][1] * n

print(ans)