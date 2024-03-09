def solution(my_string):
    answer = [0] * 52
    alphs = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz'
    for i, v in enumerate(alphs):
        for j in my_string:
            if v == j:
                answer[i] += 1
    return answer