def solution(arr, queries):
    answer = []
    temp = []
    for s, e, k in queries:
        temp = arr[s:e+1]
        for i in temp:
            filtered = [item for item in temp if item > k]
            if filtered:
                answer.append(min(filtered))
                break
            else:
                answer.append(-1)
                break
    return answer