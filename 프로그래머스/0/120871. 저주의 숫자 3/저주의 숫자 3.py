def solution(n):
    answer = 0
    count = 0
    num = 0
    
    while count < n:
        if num % 3 != 0 and '3' not in str(num):
            count += 1
            if count == n:
                answer = num
        num += 1
    
    return answer