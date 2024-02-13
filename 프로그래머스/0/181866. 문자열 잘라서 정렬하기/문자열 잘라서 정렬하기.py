def solution(myString):
    answer = []
    nu_str = myString.split('x')
    for i in nu_str:
        if i:
            answer.append(i)
        answer = sorted(answer)
    return answer