def solution(keyinput, board):
    start = [0, 0]
    x_min, x_max = int(-board[0] / 2), int(board[0] / 2)
    y_min, y_max = int(-board[1] / 2), int(board[1] / 2)
    for i in keyinput:
        if i == 'up':
            if start[1] < y_max:
                start[1] += 1
        elif i == 'down':
            if start[1] > y_min:
                start[1] -= 1
        elif i == 'left':
            if start[0] > x_min:
                start[0] -= 1
        elif i == 'right':
            if start[0] < x_max:
                start[0] += 1
    
    return start