def solution(numbers, direction):
    
    ans = []
    if direction == 'right':
        ans.append(numbers[-1])
        return ans + numbers[:-1]
    else:
        ans.append(numbers[0])
        return numbers[1:] + ans