def solution(s, n):
    answer = ''
    up_alphs = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'
    lo_alphs = up_alphs.lower()
    
    for i in s:
        if i in up_alphs:
            idx = up_alphs.index(i) + n
            answer += up_alphs[idx % 26]
        elif i in lo_alphs:
            idx = lo_alphs.index(i) + n
            answer += lo_alphs[idx % 26]
        else:
            answer += i
    return answer