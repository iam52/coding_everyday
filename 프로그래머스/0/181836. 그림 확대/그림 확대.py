def solution(picture, k):
    answer = []
    for i in picture:
        expand = ''.join([j*k for j in i])
        for _ in range(k):
            answer.append(expand)
    return answer