def check(s):
    stack = []

    ans = False
    for i in s:
        if i == '[' or i == '(' or i == '{':
            stack.append(i)
            ans = True

        elif len(stack) and i == ']' and stack[-1] == '[':
            stack.pop()

        elif len(stack) and i == ')' and stack[-1] == '(':
            stack.pop()

        elif len(stack) and i == '}' and stack[-1] == '{':
            stack.pop()

    if len(stack) or not ans:
        return False
    elif len(stack) == 0 or ans:
        return True
    
    
def solution(s):
    
    r = ''
    ans = 0
    
    for i in range(len(s)):
        r = s[i:] + s[:i]
        
        if check(r):
            ans += 1
            
    return ans