def solution(myString, pat):
    answer = 0
    if pat.upper() in myString.upper():
        answer = 1
    else:
        answer = 0
    return answer