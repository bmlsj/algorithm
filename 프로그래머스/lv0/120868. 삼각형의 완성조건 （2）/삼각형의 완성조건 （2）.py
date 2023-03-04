def solution(sides):
    
    ans = []
    short = min(sides)
            
    # 주의 : sides의 원소의 길이는 있지만, 다른 한 변의 길이 범위는 존재하지 않음
    # return len([i for i in range(1, 1001) if sum(sides) > i > max(sides) - min(sides)])
    
    return 2*short - 1