def solution(n, arr1, arr2):
    decoded_map = []
    for i in range(n):
        line = ''
        for j in range(n):
            if arr1[i] % 2 == 1 or arr2[i] % 2 == 1:
                line = '#' + line
            else:
                line = ' ' + line
            arr1[i] //= 2
            arr2[i] //= 2
        decoded_map.append(line)
    return decoded_map