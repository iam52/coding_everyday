def solution(n, k):
    answer = 0
    l = n * 12000

    for i in range(1, n+1):
        if i % 10 == 0:
            k -= 1

    answer = l + (k * 2000)
    return answer