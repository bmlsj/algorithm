def solution(s):
    
    stack = []
    for ss in s:
        if len(stack) == 0:
            stack.append(ss)
        
        elif ss == ")" and stack[-1] == "(":
            stack.pop()
        
        else:
            stack.append(ss)
        
    print(stack)
    return len(stack) == 0