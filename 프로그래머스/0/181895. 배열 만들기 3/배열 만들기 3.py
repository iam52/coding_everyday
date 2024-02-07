def solution(arr, intervals):
    x, y = intervals[0][0], intervals[0][1]
    w, z = intervals[1][0], intervals[1][1]
    return arr[x:y+1] + arr[w:z+1]