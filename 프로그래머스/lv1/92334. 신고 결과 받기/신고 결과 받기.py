def solution(id_list, report, k):
    
    id_dict = {}
    for id in id_list:
        id_dict[id] = 0
    
    mail = [[] for _ in range(len(id_list))]
    for i in range(len(report)):
        user, target = report[i].split()
        if target not in mail[id_list.index(user)]:
            id_dict[target] += 1
            mail[id_list.index(user)].append(target)
    

    result = []
    for ids in mail:
        cnt = 0
        
        for id in ids:
            if id_dict[id] >= k:
                cnt += 1
        result.append(cnt)
    
    return result