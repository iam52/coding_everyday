def solution(num_list, n):
    answer = []
    arr = list(range(0, len(num_list), n))

    for i in arr:
        answer.append(num_list[i:i+n])
    return answer