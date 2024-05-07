def solution(array):
    answer = []
    for i in range(len(array)):
        if array[i] == max(array):
            return [array[i], i]
