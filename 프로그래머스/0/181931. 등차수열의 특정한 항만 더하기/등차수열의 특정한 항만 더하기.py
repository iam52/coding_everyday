def solution(a, d, included):
    answer = 0
    add = []
    for i in range(len(included)):
        add.append(a + (i*d))
        if included[i] == True:
            answer += add[i]
    return answer