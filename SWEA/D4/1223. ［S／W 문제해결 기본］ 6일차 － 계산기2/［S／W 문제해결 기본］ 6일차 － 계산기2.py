
for tc in range(1, 11):

    T = int(input())
    TC = list(input())

    # 1. 후위 표기식으로 바꾸기
    priority = {'*': 2, '+': 1}
    postfix = []
    stack = []

    for i in TC:
        if i != '*' and i != '+':  # 숫자일 경우
            postfix.append(i)

        elif not stack:  # 스택이 비었을 경우
            stack.append(i)

        else:  # 스택이 비어있지 않으면
            # 현재 연산자가 stack의 마지막 연산자보다 우선순위가 낮다면,
            # stack에 남아 있는 연산자를 postfix로
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
