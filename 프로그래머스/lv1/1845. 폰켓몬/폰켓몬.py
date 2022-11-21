def solution(nums):
    answer = 0
    length = len(nums) // 2
    temp = list(set(nums))

    for _ in temp:
        if answer < length:
            answer += 1

    return answer