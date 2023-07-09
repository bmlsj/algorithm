def solution(todo_list, finished):
    
    ans = []
    for i in range(len(todo_list)):
        if not finished[i]:
            ans.append(todo_list[i])
    
    return ans