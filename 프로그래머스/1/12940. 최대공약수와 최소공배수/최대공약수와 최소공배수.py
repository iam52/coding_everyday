def solution(n, m):
    answer = []
    temp = []
    for i in range(1, n+m):
        if n % i == 0 and m % i == 0:
            temp.append(i)
    answer.append(max(temp))
    answer.append(n*m // answer[0])
    return answer