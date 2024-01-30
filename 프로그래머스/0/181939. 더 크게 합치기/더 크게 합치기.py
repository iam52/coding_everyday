def solution(a, b):
    answer = 0
    concat1 = str(a) + str(b)
    concat2 = str(b) + str(a)
    if int(concat1) > int(concat2):
        answer = int(concat1)
    else:
        answer = int(concat2)
    
    return answer