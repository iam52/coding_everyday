def solution(a, b):
    answer = 0
    t = []
    t.append(a)
    t.append(b)
    a = min(t)
    b = max(t)

    for i in range(a, b+1):
        answer += i
    return answer