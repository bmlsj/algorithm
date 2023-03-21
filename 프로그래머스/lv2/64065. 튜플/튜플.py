def solution(s):
    
    s = s[1:-1]
    c = ''
    ans, num = [], []
    for i in range(len(s)):
        if s[i].isdigit():
            c += s[i]
            if not s[i+1].isdigit():
                num.append(c)
                c = ''
        if s[i] == '}':
            ans.append(num)
            num = []
        else:
            continue
    
    ans.sort(key=len)
    result = []
    for i in ans:
        for j in i:
            if j not in result:
                result.append(j)

    return list(map(int, result))