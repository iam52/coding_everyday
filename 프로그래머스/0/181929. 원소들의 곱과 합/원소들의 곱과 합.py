def solution(num_list):
    answer = 0
    multi = 1
    for i in num_list:
        multi *= i
    if multi < sum(num_list) ** 2:
        answer = 1
    else:
        answer = 0
    return answer