def solution(dots):
    
    l_list = []
    h_list = []
    for i in range(len(dots)):
        l_list.append(dots[i][0])
        
    for i in range(len(dots)):    
        h_list.append(dots[i][1])
    
    l = max(l_list) - min(l_list)
    h = max(h_list) - min(h_list)
    
    return l * h
