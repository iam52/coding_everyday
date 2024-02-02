
def solution(n, k):
    total = n*12000 + k*2000
    service = (n // 10) * 2000
    return total - service