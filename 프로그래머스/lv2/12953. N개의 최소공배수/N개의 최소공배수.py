def solution(arr):
                                
    def gcd(a, b):   

        for i in range(1, b+1):
            for j in range(1, a+1):
                if a * i == b * j:
                    return a * i
    
    ans = gcd(arr[0], arr[1])
    for i in range(2, len(arr)):
        ans = gcd(ans, arr[i])
    
    return ans