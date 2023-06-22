def solution(food):
    
    result = ""
    for i in range(1, len(food)):
        if food[i] // 2:
            for _ in range(food[i] // 2):
                result += str(i)
    
    return result + "0" + result[::-1]