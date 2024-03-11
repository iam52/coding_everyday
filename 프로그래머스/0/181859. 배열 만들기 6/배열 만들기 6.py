def solution(arr):
    answer = []
    stk = []
    i = 0
    while i < len(arr):
        if stk:
            if stk[-1] == arr[i]:
                stk.pop()
                i += 1
            else:
                if stk[-1] != arr[i]:
                    stk.append(arr[i])
                    i += 1
        else:
            stk.append(arr[i])
            i += 1

    answer = stk

    if stk == []:
        answer = [-1]
    return answer