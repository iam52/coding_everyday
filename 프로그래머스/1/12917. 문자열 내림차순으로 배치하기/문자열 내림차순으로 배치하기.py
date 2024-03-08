def solution(s):
    answer = []
    for i in list(s):
        if i == i.lower():
            answer.append(i)
            answer.sort(reverse=True)
        elif i == i.upper():
            answer.append(i)
    return ''.join(answer)