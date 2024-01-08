def solution(arr, flag):
    answer = []
    for i, v in enumerate(flag):
        if v:
            answer += [arr[i]] * (arr[i]*2)
        else:
            for _ in range(arr[i]):
                answer.pop()
    return answer