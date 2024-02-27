def solution(i, j, k):
    answer = 0
    set = ''
    for i in range(i, j+1):
        set += str(i)
    for j in list(set):
        if int(j) == k:
            answer += 1
    return answer