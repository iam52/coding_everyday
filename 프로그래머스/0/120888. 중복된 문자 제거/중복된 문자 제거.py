def solution(my_string):
    answer = ''
    my_string = list(my_string)
    for i in my_string:
        if i not in answer:
            answer += i
    return answer