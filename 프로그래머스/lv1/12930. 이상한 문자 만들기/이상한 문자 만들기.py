def solution(s):
    ans = s.split(' ')
    result = ''
    for i in ans:
        for c in range(len(i)):
            if c%2 == 0:
                result += i[c].upper()
            else:
                result += i[c].lower()
            
        result += ' '
        
    return result[0:-1]
 