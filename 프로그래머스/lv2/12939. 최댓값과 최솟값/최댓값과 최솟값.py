def solution(s):
    
    num = s.split(" ")   
    n = list(map(int, num))
    
    return f"{min(n)} {max(n)}"