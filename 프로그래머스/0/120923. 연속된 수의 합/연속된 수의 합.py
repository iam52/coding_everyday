def solution(num, total):
    answer = []
    
    avg = total // num
    start = avg - (num-1) // 2
    
    for i in range(num):
        answer.append(start+i)
    
    return answer