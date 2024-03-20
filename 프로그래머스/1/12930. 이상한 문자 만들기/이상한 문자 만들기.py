def solution(s):
    answer = ''
    ss = s.split(' ')
    for i in ss:
        temp = ''
        for idx, value in enumerate(i):
            if idx % 2 == 0:
                temp += value.upper()
            else:
                temp += value.lower()
        answer += (temp+' ')
    return answer[:-1]