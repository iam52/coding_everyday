def solution(numbers, direction):
    answer = []
    if direction == "right":
        for i in range(len(numbers)):
            answer.append(numbers[i-1])
    elif direction == "left":
        for i in range(len(numbers)):
            answer.append(numbers[i-len(numbers)+1])
    return answer