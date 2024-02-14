def solution(order):
    answer = 0
    order = str(order)
    for i in order:
        i = int(i)
        if i == 0:
            continue
        elif i % 3 == 0:
            answer += 1
    return answer