def solution(array, commands):
    answer = []
    temp = []
    for idx in range(len(commands)):
        i, j, k = commands[idx][0], commands[idx][1], commands[idx][2]
        temp.append(sorted(array[i-1:j]))
        print(temp)
        answer.append(temp[idx][k-1])
    return answer