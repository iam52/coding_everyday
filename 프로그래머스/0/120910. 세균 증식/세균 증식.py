def solution(n, t):
    answer = 0
    for _ in range(t):
        n *= 2
    return n