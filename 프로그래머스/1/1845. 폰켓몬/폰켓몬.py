def solution(nums):
    
    numset = set()
    for num in nums:
        numset.add(num)

    return len(nums) // 2 if len(numset) >= len(nums) // 2 else len(numset)