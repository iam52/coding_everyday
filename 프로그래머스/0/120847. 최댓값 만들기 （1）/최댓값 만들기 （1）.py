def solution(numbers):
    answer = 0
    nu_num = sorted(numbers)
    answer = nu_num[-1] * nu_num[-2]
    return answer