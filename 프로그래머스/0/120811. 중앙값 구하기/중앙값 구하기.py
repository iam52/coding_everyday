def solution(array):
    answer = 0
    array = sorted(array)
    if len(array) % 2 == 1:
        idx = len(array) // 2
    answer = array[idx]
    return answer