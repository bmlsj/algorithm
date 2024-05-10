def solution(nums):
    
    sl = len(set(nums))
    return min(sl, len(nums) / 2)