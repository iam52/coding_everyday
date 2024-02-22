def solution(my_string, indices):
    answer = ''
    for idx, str in enumerate(my_string):
        if idx not in indices:
            answer += str
    return answer