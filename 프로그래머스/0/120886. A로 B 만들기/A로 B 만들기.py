def solution(before, after):
    answer = 0
    before_dict = {}
    after_dict = {}

    for char in before:
        if char in before_dict:
            before_dict[char] += 1
        else:
            before_dict[char] = 1

    for char in after:
        if char in after_dict:
            after_dict[char] += 1
        else:
            after_dict[char] = 1

    if before_dict == after_dict:
        answer = 1
    else:
        answer = 0
    return answer