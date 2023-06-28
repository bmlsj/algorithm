def solution(arr):
    
    ans = []
    for num in arr:
        if num >= 50 and num % 2 == 0:
            num //= 2
        elif num < 50 and num % 2 != 0:
            num *= 2
        ans.append(num)
    
    return ans