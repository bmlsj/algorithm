def check(board, i, j):
    if 0 <= i < len(board) and 0 <= j < len(board):
        board[i][j] = 1
    return board

def solution(board):
    
    map = []
    for i in range(len(board)):
        for j in range(len(board)):
            if board[i][j] == 1:
                map.append((i, j))
    
    for i, j in map:
        check(board, i, j+1)
        check(board, i, j-1)
        check(board, i-1, j)
        check(board, i-1, j+1)
        check(board, i-1, j-1)
        check(board, i+1, j+1)
        check(board, i+1, j)
        check(board, i+1, j-1)
    
    cnt = 0
    for i in range(len(board)):
        for j in range(len(board)):
            if board[i][j] == 1:
                cnt += 1
    
    return (len(board)*len(board)) - cnt