def solution(my_string):
    answer = []
    for i in range(len(my_string)):
        answer.append(my_string[i:])
        nu_ans = sorted(answer)
    return nu_ans