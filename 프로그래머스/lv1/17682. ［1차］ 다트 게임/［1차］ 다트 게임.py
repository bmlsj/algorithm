def solution(dartResult):
    ans = []
    square = {'S': 1, 'D': 2, 'T': 3}
    option = {'*': 2, '#': -1}
    num = -111
    check = False
    for i in range(len(dartResult)):
        if check:
            check = False
            continue

        if dartResult[i].isdigit():
            if num != -111:
                ans.append(num)
            if i + 1 < len(dartResult) and dartResult[i].isdigit() and dartResult[i+1].isdigit():
                num = int(dartResult[i] + dartResult[i+1])
                check = True
            else:
                num = int(dartResult[i])
                
        elif dartResult[i] == 'S' or dartResult[i] == 'D' or dartResult[i] == 'T':
            num **= square[dartResult[i]]
            
        elif dartResult[i] == '*' or dartResult[i] == '#':
            if i - 1 > 0 and len(ans) >= 1 and dartResult[i] == '*':
                ans[-1] *= option[dartResult[i]]
                num *= option[dartResult[i]]
            else:
                num *= option[dartResult[i]]

    if num != 0:
        ans.append(num)
    print(ans)
    return sum(ans)

