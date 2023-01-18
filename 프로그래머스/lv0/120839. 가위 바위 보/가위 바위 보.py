def solution(rsp):
    # 가위 2, 바위 0, 보 5
    
    game = {'2':'0', '0':'5', '5':'2'}
    s = ''
    for i in rsp:
        s += game[i]
    return s