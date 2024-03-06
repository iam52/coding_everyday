def solution(strArr):
    answer = 0
    groups = {}
    
    for i in strArr:
        length = len(i)
        if length in groups:
            groups[length].append(i)
        else:
            groups[length] = [i]
    
    for group in groups.values():
        answer = max(answer, len(group))
            
    return answer