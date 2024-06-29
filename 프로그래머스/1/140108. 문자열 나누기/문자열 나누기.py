def solution(s):
    ans = 0
    same, diff = 0, 0
    check = ''
    for c in s:
        if same == diff:
            ans += 1
            check = c

        if c == check:
            same += 1
        else:
            diff += 1
    return ans