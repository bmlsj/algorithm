
for t in range(1, 11):
    n = int(input())  # 원본 암호문 길이
    original = list(map(int, input().split()))

    m = int(input())  # 명령어 개수
    comment = list(input().split('I '))

    for i in range(len(comment)):
        if comment[i].startswith('D'):
            dlist = comment[0].split('D ')
            for j in range(1, len(dlist)):
                ridx, rval = dlist[j].split()
                for a in range(int(rval)):
                    original.remove(original[int(ridx)])

        elif comment[i] != '':
            x, y, *s = comment[i].split()

            for j in range(len(s)):
                if s[j] == 'D':
                    dlist = []
                    for k in range(j, len(s), 3):
                        dlist.append([s[k], s[k + 1], s[k + 2]])

                    for d, ridx, rval in dlist:
                        for k in range(int(rval)):
                            original.remove(original[int(ridx)])
                    break

                else:
                    original.insert(int(x) + j, int(s[j]))

    print(f"#{t}", end=' ')
    for i in range(10):
        print(original[i], end=' ')
    print()
