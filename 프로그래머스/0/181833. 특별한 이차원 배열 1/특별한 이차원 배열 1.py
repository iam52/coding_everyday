def solution(n):
    answer = []
    for i in range(n):
        answer.append([0] * n)

    for j in range(len(answer)):
        answer[j][j] = 1
    return answer