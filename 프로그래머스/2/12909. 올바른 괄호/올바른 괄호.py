def solution(s):
    answer = True
    cnt = 0

    if s[0] == ')':
        answer = False
    for i in s:
        if i == '(':
            cnt += 1
        else:
            if cnt == 0:
                answer = False
            cnt -= 1

    if cnt > 0:
        answer = False
    return answer