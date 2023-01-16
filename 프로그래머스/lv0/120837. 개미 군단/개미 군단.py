def solution(hp):
    
    ans = 0
    ans += (hp // 5)
    hp = (hp % 5)
    
    if hp >= 3:
        ans += (hp // 3)
        hp = (hp % 3)   
    
    ans += hp
    
    return ans