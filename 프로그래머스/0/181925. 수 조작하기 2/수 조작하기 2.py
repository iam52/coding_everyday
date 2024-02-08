def solution(numLog):
    answer = ''
    controls = {'w': 1, 's': -1, 'd': 10, 'a': -10}

    for i in range(len(numLog)-1):
        con_nums = numLog[i+1] - numLog[i]
        for key, value in controls.items():
            if value == con_nums:
                answer += key
    return answer