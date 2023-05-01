for k in range(1, 11):

    n = int(input())
    s = input()

    stack = []
    postfix = ""

    # 후위 표기식으로 변경
    for i in s:
        if i == '+':
            stack.append(i)
        elif len(stack) and i != '+':
            postfix += i
            postfix += stack.pop()
        else:
            postfix += i

    cal = []
    ans = 0
    # 후위 표기식을 다시 덧셈
    for i in postfix:
        if i != '+':
            cal.append(int(i))
        elif i == '+':
            n1 = cal.pop()
            n2 = cal.pop()
            cal.append(n1 + n2)

    print(f"#{k} {cal[0]}")