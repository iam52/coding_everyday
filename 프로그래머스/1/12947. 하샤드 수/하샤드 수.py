def solution(x):
    answer = True
    total = 0
    nu_x = list(str(x))
    for i in nu_x:
        total += int(i)

    if x % total == 0:
        answer = True
    else:
        answer = False
    return answer