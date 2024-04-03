def solution(s):
    answer = []
    prev = {}
    
    for i, v in enumerate(s):
        if v in prev:
            answer.append(i - prev[v])
        else:
            answer.append(-1)
        prev[v] = i
    return answer