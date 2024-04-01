def solution(l, r):
    answer = []
    for i in range(l, r+1):
        if not set(str(i)) - set(['5', '0']):
            answer.append(i)
    return answer if answer else [-1]