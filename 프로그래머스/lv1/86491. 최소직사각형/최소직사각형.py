def solution(sizes):
    
    wid = []
    height = []
    for w, h in sizes:
        if w > h:
            w, h = h, w
            wid.append(w)
            height.append(h)
        else:
            wid.append(w)
            height.append(h)
    
    return max(wid) * max(height)
    