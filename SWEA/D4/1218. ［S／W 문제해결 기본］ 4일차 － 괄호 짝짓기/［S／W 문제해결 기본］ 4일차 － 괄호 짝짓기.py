
for t in range(1, 11):

    n = int(input())
    arr = list(input())

    stack = []
    ans = 1

    for i in arr:
        if i == '(':
            stack.append(i)

        elif i == ')' and len(stack):
            if '(' not in stack:
                ans = 0
            else:
                stack.pop(stack.index('('))


        if i == '<':
            stack.append(i)
        elif i == '>' and len(stack):
            if '<' not in stack:
                ans = 0
            else:
                stack.pop(stack.index('<'))

        if i == '[':
            stack.append(i)
        elif i == ']' and len(stack):
            if '[' not in stack:
                ans = 0
            else:
                stack.pop(stack.index('['))

        if i == '{':
            stack.append(i)
        elif i == '}' and len(stack):
            if '{' not in stack:
                ans = 0
            else:
                stack.pop(stack.index('{'))

    print(f"#{t} {ans}")