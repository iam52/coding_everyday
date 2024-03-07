def solution(s):
    answer = 0
    list_s = s.split(' ')
    for i in range(len(list_s)):
        if list_s[i] == 'Z':
            list_s[i] = '-' + list_s[i-1]

    for j in list_s:
        if '--' in j:
            j = int(j.lstrip('--'))
        else:
            j = int(j)
        answer += j
    return answer