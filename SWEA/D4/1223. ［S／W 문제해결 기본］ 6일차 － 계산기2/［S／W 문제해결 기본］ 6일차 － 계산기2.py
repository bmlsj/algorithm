
for tc in range(1,11):

    T = int(input())
    TC = list(input())

    # 1. 후위 표기식으로 바꾸기
    priority = {'*':2, '+':1}
    postfix = []
    stack = []
    for i in TC:
        # 숫자면 결과에 넣기
        if i != '*' and i != '+':
            postfix.append(i)

        elif not stack:
                stack.append(i)
            # 스택이 비어있지 않으면
        else:
            # stack[-1] 보다 우선순위가 낮다면 stack에 있는 연산자 다 빼내기
            if priority[stack[-1]] >= priority[i]:
                while stack and priority[stack[-1]] >= priority[i]:
                    postfix.append(stack.pop())
            stack.append(i)
    # 남아있는 연산자 모두 넣기
    while stack:
        postfix.append(stack.pop())

    cal = []
    for i in postfix:
        if i != '+' and i != '*':
            cal.append(int(i))

        elif i == '*':
            n1 = cal.pop()
            n2 = cal.pop()
            cal.append(n1 * n2)

        elif i == '+':
            n1 = cal.pop()
            n2 = cal.pop()
            cal.append(n1 + n2)

    print(f"#{tc} {cal[0]}")