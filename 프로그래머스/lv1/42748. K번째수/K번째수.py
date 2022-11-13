def solution(array, commands):
    answer = []
    temp = []

    for i in range(len(commands)):
        first = commands[i][0] -1
        end = commands[i][1] -1
        idx = commands[i][2] - 1
        print(array[first: end+1])

        temp.append(array[first: end + 1])
        temp[i].sort()
        print(temp)
        answer.append(temp[i][idx])

    return answer