def solution(s):
    answer = ''
    for i in sorted(list(s), reverse=True):
        if i == i.lower():
            answer += i
        elif i == i.upper():
            answer += i
    return answer