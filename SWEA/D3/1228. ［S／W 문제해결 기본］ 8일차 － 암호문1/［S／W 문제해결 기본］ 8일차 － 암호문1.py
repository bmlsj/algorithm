
for t in range(1, 11):
    n = int(input())  # 원본 암호문 길이
    original = list(map(int, input().split()))

    m = int(input())  # 명령어 개수
    comment = list(input().split('I '))

    for i in range(1, m + 1):
        x, y, *s = comment[i].split()
        for j in range(int(y)):
            original.insert(int(x) + j, int(s[j]))

    print(f"#{t}", end=' ')
    for idx in range(10):
        print(original[idx], end=' ')
    print()
