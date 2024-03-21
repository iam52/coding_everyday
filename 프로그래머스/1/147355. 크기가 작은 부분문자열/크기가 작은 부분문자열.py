def solution(t, p):
    answer = 0
    len_threes = [t[i:i+len(p)] for i in range(len(t)) if len(t[i:i+len(p)]) == len(p)]
    for three in len_threes:
        if three <= p:
            answer += 1
    return answer