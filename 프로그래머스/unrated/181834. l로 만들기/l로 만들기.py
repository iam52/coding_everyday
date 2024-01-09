def solution(myString):
    answer = ''
    alphabet = 'abcdefghijklmnopqrstuvwxyz'
    for i in myString:
        if i < alphabet[11]:
            answer += 'l'
        else:
            answer += i
    return answer