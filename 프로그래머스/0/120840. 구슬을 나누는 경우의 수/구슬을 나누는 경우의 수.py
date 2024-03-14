def solution(balls, share):
    if share > balls - share:
        share = balls - share
    result = 1
    
    for i in range(share):
        result *= balls - i
        result //= i + 1
    return result