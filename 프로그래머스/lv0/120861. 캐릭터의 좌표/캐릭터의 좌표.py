def solution(keyinput, board):
    col = board[0]  # 7
    row = board[1]  # 9
    start = [0, 0]
    
    for i in keyinput:
        if i == "left" and start[0] - 1 >= -(col // 2):
            start[0] -= 1
            
        elif i == "right" and start[0] + 1 <= (col // 2):
            start[0] += 1
            
        elif i == "up" and start[1] + 1 <= (row // 2):
            start[1] += 1
            
        elif i == "down" and start[1] - 1 >= -(row // 2):
            start[1] -= 1
            
    return start