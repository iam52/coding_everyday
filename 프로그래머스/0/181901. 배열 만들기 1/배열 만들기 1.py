def solution(n, k):
    answer = []
    for i in range(k, n+1, k):
        answer.append(i)
        answer.sort()
    return answer