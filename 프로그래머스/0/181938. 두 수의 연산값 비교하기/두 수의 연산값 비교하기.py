def solution(a, b):
    answer = 0
    conc = str(a) + str(b)
    if int(conc) > 2 * a * b:
        answer = int(conc)
    elif int(conc) < 2 * a * b:
        answer = 2 * a * b
    elif int(conc) == 2 * a * b:
        answer = int(conc)
    return answer