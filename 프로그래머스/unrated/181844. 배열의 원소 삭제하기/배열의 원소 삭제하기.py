def solution(arr, delete_list):
    
    ans = []
    for num in arr:
        if num in delete_list:
            continue
        ans.append(num)
    return ans