def solution(board):

    answer = 1
    if all(board[i][j] == 0 for i in range(len(board)) for j in range(len(board[0]))):
        answer = 0
        
    for m in range(1, len(board)):
        for n in range(1, len(board[0])):
            if board[m][n] == 1:
                board[m][n] = min(board[m - 1][n], board[m - 1][n - 1], board[m][n - 1]) + 1
                if board[m][n] > answer:
                    answer = board[m][n]

    return answer * answer