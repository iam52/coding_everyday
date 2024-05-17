def solution(a, b):
    answer = 0
    plus1 = int(str(a) + str(b))
    plus2 = int(str(b) + str(a))
    
    if plus1 > plus2 or plus1 == plus2:
        answer = plus1
    else:
        answer = plus2
    
    return answer