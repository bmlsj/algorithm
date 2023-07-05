def solution(keymap, targets):
    keycnt = {}
    for key in keymap:
        for k in range(len(key)):
            if key[k] in keycnt and k + 1 > keycnt[key[k]]:
                continue
            keycnt[key[k]] = k + 1
    
    ans = []
    for tar in targets:
        cnt = 0
        for t in tar:
            if t in keycnt:
                cnt += keycnt[t]
            else:
                cnt = -1
                break
        ans.append(cnt)
    
    return ans