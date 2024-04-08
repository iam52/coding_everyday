def solution(food):
    answer = ''
    temp = []
    for i, v in enumerate(food):
        temp.append(v // 2)
        if temp[i] == 0:
            continue
        answer += str(i) * temp[i]
    return answer + '0' + answer[::-1]