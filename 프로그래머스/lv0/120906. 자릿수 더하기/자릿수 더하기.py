def solution(n):
    ans = 0
    
    # 1
    # while n > 0:
    #    ans += (n%10)
    #    n = (n//10)
        
    return sum(int(i) for i in str(n))
        
        
  #  return ans