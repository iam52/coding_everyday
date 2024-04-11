def solution(a, b, n):
    answer = 0
    while n >= a:
        exchange = n // a
        answer += exchange * b
        n = n % a + exchange * b
    return answer