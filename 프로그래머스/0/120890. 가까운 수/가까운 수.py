def solution(array, n):
    answer = 0
    temp = []
    array.sort()
    for i in range(len(array)):
        temp.append(abs(array[i] - n))
        idx = temp.index(min(temp))
    return array[idx]
