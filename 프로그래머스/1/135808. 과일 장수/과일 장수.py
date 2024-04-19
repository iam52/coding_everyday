def solution(k, m, score):
    answer = 0
    boxes = []

    score.sort(reverse=True)

    for i in range(0, len(score), m):
        boxes.append(score[i:i+m])
        if len(score[i:i+m]) < m:
            boxes.pop()

    for j in boxes:
        answer += min(j) * m
    return answer