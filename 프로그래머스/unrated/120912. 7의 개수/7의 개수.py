def solution(array):
    answer = 0
    b=[]
    a = ''.join(str(array))
    for i in a:
        if i == '7':
            b.append(a)
            answer = len(b)
    return answer