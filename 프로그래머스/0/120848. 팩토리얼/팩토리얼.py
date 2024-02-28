def solution(n):
    f = 1
    i = 0
    
    while f <= n:
        i += 1
        f *= i
        
    answer = i-1
    return answer