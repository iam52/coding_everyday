def solution(quiz):
    answer = []
    for i in quiz:
        splited = i.split(' ')
        x = int(splited[0])
        op = splited[1]
        y = int(splited[2])
        z = int(splited[-1])

        if op == '+':
            if x + y == z:
                answer.append('O')
            else:
                answer.append('X')
        else:
            if x - y == z:
                answer.append('O')
            else:
                answer.append('X')
    return answer