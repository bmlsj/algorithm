def solution(arr, divisor):

    ans = []
    arr.sort()
    for i in arr:
        if not i % divisor:
            ans.append(i)
        
    if not len(ans):     
        ans.append(-1)
       
    return ans
