def solution(my_string, indices):
    answer = ''
    for i, v in enumerate(my_string):
        if i not in indices:
            answer += v
    return answer