def solution(my_string, overwrite_string, s):
    answer = ''
    for idx, char in enumerate(my_string):
        if idx < s:
            answer += char
        elif idx >= s:
            answer += overwrite_string
            answer += my_string[s+len(overwrite_string):]
            break
    return answer