def solution(k, score):
    answer = []
    fame = []
    
    for i in score:
        fame.append(i)
        fame.sort(reverse=True)
        
        if len(fame) > k:
            fame.pop()
            
        answer.append(fame[-1])
    return answer