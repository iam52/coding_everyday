def solution(binomial):
    answer = 0
    nu_bin = binomial.split()
    if nu_bin[1] == '*':
        answer = int(nu_bin[0]) * int(nu_bin[-1])
    elif nu_bin[1] == '+':
        answer = int(nu_bin[0]) + int(nu_bin[-1])
    elif nu_bin[1] == '-':
        answer = int(nu_bin[0]) - int(nu_bin[-1])
    return answer