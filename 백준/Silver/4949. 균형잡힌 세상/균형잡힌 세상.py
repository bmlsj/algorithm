sen = []

while True:
    s = input()
    if s == '.':
        break

    stack = []
    for arr in s:

        if arr == '(' or arr == '[':
            stack.append(arr)

        elif arr == ']':
            if len(stack) and stack[-1] == '[':
                stack.pop()
            else:
                stack.append(']')
                break

        elif arr == ')':
            if len(stack) and stack[-1] == '(':
                stack.pop()
            else:
                stack.append(arr)

    if len(stack):
        print("no")
    else:
        print("yes")