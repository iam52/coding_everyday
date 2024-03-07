def solution(left, right):
    answer = 0
    temp = []
    for i in range(left, right+1):
        for j in range(1, right+1):
            if i % j == 0:
                temp.append(i)

    element_cnt = {}
    for element in temp:
        if element in element_cnt:
            element_cnt[element] += 1
        else:
            element_cnt[element] = 1

    for k, v in element_cnt.items():
        if v % 2 == 0:
            answer += k
        else:
            answer -= k
    return answer