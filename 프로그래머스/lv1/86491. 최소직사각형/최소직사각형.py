def solution(sizes):
    
    wid, hei = 0, 0
    for w, h in sizes:
        if w > h:
            w, h = h, w
        
        wid = max(wid, w)  # wid와 w 중 max값을 선택
        hei = max(hei, h)
    
    return wid * hei
    