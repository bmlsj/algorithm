def solution(s, n):
    answer = ''
    for c in s:
        cInt = ord(c)
        if c != " ":
            if cInt <= 90:
                cInt = (cInt - 65 + n) % 26
                answer += chr(cInt+65)
            else:
                cInt = (cInt - 97 + n) % 26
                answer += chr(cInt+97)
        else:
            answer += " "
    return answer