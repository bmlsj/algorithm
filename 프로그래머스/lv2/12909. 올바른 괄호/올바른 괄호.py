def solution(s):
    
    ans = list(s)
    stack = []
    
    for i in ans:
        if i == '(':
            stack.append('(')
        elif len(stack) and i == ')':
            stack.pop()
        else: return False
    
    return False if len(stack) else True