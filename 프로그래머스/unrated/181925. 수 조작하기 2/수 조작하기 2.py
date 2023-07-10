def solution(numLog):
    
    comment = {1:'w', -1:'s', 10:'d', -10:'a'}
    result = ''
    for i in range(len(numLog)-1):
        num = numLog[i+1] - numLog[i]
        if num in comment.keys():
            result += comment[num]
    
    return result