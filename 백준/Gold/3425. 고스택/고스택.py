def program(comments, num):
    stack = [num]
    for comment in comments:
        if comment.startswith("NUM"):
            com, n = comment.split()
            stack.append(int(n))

        elif not stack:
            return "ERROR"

        elif comment == "POP":
            # 숫자가 부족할 때
            if len(stack) == 0:
                return "ERROR"
            stack.pop()

        elif comment == "INV":
            # 숫자가 부족할 때
            if len(stack) == 0:
                return "ERROR"
            stack[-1] *= -1

        elif comment == "DUP":
            # 숫자가 부족할 때
            if len(stack) == 0:
                return "ERROR"
            stack.append(stack[-1])

        elif comment == "SWP":
            # 숫자가 부족할 때
            if len(stack) < 2:
                return "ERROR"

            stack[-1], stack[-2] = stack[-2], stack[-1]

        elif comment == "ADD":
            # 숫자가 부족할 때
            if len(stack) < 2:
                return "ERROR"

            tmp = stack.pop() + stack.pop()
            if abs(tmp) > 10 ** 9:
                return "ERROR"
            stack.append(tmp)

        elif comment == "SUB":
            # 숫자가 부족할 때
            if len(stack) < 2:
                return "ERROR"

            tmp = -stack.pop() + stack.pop()
            if abs(tmp) > 10 ** 9:
                return "ERROR"
            stack.append(tmp)

        elif comment == "MUL":
            # 숫자가 부족할 때
            if len(stack) < 2:
                return "ERROR"

            tmp = stack.pop() * stack.pop()
            if abs(tmp) > 10 ** 9:
                return "ERROR"
            stack.append(tmp)

        elif comment == "DIV":

            a, b = stack.pop(), stack.pop()
            # 0으로 나눴을 때
            if a == 0:
                return "ERROR"
            tmp = abs(b) // abs(a)
            if (a > 0 and b < 0) or (a < 0 and b > 0):
                tmp = -tmp
            if abs(tmp) > 10 ** 9:
                return "ERROR"
            stack.append(tmp)

        elif comment == "MOD":

            a, b = stack.pop(), stack.pop()
            # 0으로 나눴을 때
            if a == 0:
                return "ERROR"
            tmp = abs(b) % abs(a)

            if b < 0:
                tmp = -tmp
                
            if abs(tmp) > 10 ** 9:
                return "ERROR"
            stack.append(tmp)

        else:
            return "ERROR"

    if len(stack) == 1:
        return stack[0]

    return "ERROR"


while True:
    comment_list = []

    while True:
        comment = input().strip()
        if comment == "END":
            break

        if comment == "QUIT":
            quit()

        comment_list.append(comment)

    n = int(input())
    for _ in range(n):
        num = int(input())
        print(program(comment_list, num))

    print()
    input()  # 줄바꿈 삭제
