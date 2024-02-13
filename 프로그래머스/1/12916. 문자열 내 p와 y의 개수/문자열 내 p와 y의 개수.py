def solution(s):
    answer = True
    ps = 0
    ys = 0
    for i in s:
        if i == 'p' or i == 'P':
            ps += 1
        elif i == 'y' or i == 'Y':
            ys += 1
        else:
            answer = True

    if ps == ys:
        answer = True
    else:
        answer = False
    
    return answer