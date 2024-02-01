def solution(myString, pat):
    answer = 0
    a = []
    for i in myString:
        if i == "A":
            a.append("B")
        elif i == "B":
            a.append("A")
        nu_a = ''.join(a)
    if pat in nu_a:
        answer = 1
    else:
        answer = 0
    return answer