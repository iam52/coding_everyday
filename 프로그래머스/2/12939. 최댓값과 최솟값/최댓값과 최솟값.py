def solution(s):
    answer = ''
    temp = []
    for i in s.split(' '):
        temp.append(int(i))
        temp.sort()
    answer += str(temp[0])
    answer += ' '
    answer += str(temp[-1])
    return answer