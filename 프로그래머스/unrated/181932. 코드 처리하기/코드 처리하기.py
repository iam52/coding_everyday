def solution(code):
    answer = ''
    mode = 0
    for idx, char in enumerate(code):
        if char == "1":
            mode = 1 - mode
        else:
            if (mode == 0 and idx % 2 == 0) or (mode == 1 and idx % 2 == 1):
                answer += char
    return answer if answer else "EMPTY"