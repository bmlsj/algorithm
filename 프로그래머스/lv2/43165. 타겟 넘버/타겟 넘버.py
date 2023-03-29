def solution(numbers, target):
    
    idx = curr = 0
    def dfs(nums, curr, target, idx):
        
        if len(nums) == idx:
            return 1 if curr == target else 0
        
        return dfs(numbers, curr - nums[idx], target, idx + 1) \
          + dfs(numbers, curr + nums[idx], target, idx + 1)
    
    return dfs(numbers, curr, target, idx)