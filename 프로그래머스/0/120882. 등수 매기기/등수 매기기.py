def solution(score):
    scores = [(sum(s)/2, i) for i, s in enumerate(score)]
    scores.sort(key=lambda x: (-x[0], x[1]))
    rank = 1
    prev_score = scores[0][0]
    answer = [0] * len(score)
    
    for curr_score, idx in scores:
        if curr_score != prev_score:
            rank = scores.index((curr_score, idx)) + 1
            prev_score = curr_score
        answer[idx] = rank
    return answer