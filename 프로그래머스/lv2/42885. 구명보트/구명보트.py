def solution(people, limit):
    people.sort()
    cnt = 0
    visited = [False for _ in range(len(people))]
    start = 0

    for i in range(len(people) - 1, -1, -1):
        wei_sum = 0
        if not visited[i]:
            wei_sum += (people[i])
            visited[i] = True

            if not visited[start] and wei_sum + people[start] <= limit:
                wei_sum += (people[start])
                visited[start] = True
                start += 1

            cnt += 1

    return cnt

