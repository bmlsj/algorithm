def solution(s):
    # 함수를 완성하세요
    a = [s[0]]

    for i in s:
        if a[-1] == i:
            continue
        a.append(i)
    return a