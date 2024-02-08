def solution(arr):
    answer = 0
    cor = []
    incor = []
    for i in range(len(arr)):
        for j in range(len(arr[i])):
            if arr[i][j] == arr[j][i]:
                cor.append(arr[i][j])
            else:
                incor.append(arr[i][j])

    if incor:
        answer = 0
    else:
        answer = 1
    return answer