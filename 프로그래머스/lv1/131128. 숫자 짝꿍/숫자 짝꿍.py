def solution(X, Y):
    ylist = {y: 0 for y in Y}
    for y in Y:
        ylist[y] += 1
        
    ans = []
    print(ylist)
    for x in X:
        if x in ylist and ylist[x]:
            ans.append(int(x))
            ylist[x] -= 1

    ans.sort(reverse=True)
    res = ''.join(map(str, ans))

    if len(ans) and sum(ans) == 0:
        return '0'
    return res if len(ans) != 0 else '-1'