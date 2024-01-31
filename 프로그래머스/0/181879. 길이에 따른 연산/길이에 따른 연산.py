def solution(num_list):
    long = 0
    short = 1
    for i in num_list:
        if len(num_list) >= 11:
            long += i
            answer = long
        elif len(num_list) <= 10:
            short *= i
            answer = short
    return answer