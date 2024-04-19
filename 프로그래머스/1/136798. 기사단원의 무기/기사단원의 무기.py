def solution(number, limit, power):
    answer = 0
    divisor_cnt = [0] * (number+1)
    for i in range(1, number+1):
        for j in range(i, number+1, i):
            divisor_cnt[j] += 1
    
    for count in divisor_cnt[1:]:
        if count > limit:
            answer += power
        else:
            answer += count
    return answer