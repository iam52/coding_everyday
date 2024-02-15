def solution(n):
    answer = 0
    nu_str = str(n)
    sorted_str = sorted(nu_str, reverse=True)
    answer = int(''.join(sorted_str))
    return answer