def solution(arr):
    answer = []
    for i in arr:
        if len(arr) > len(i):
            while len(arr) > len(i):
                i.append(0)
            answer += [i]
    for j in arr:
        if len(arr) < len(i):
            arr.append([0]*len(i))
            answer = arr
    
    for k in arr:
        if len(arr) == len(k):
            answer = arr
            
    return answer