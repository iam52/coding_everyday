def solution(arr):
    answer = 0
    while True:
        temp = []
        
        for i in arr:
            if i >= 50 and i % 2 == 0:
                i //= 2
            elif i < 50 and i % 2 == 1:
                i = i*2 + 1
            temp.append(i)
            
        if arr == temp:
            break
        else:
            arr = temp
            answer += 1
    return answer