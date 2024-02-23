def solution(arr, flag):
    X = []
    for i in range(len(flag)):
        if flag[i] == True:
            for j in range(arr[i]*2):
                j = arr[i]
                X.append(j)
        elif flag[i] == False:
            for k in range(arr[i]):
                X.pop()
    return X