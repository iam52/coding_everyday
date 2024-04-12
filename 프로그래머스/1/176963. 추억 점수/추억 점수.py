def solution(name, yearning, photo):
    answer = []
    score_dict = {}
    for i in range(len(name)):
        score_dict[name[i]] = yearning[i]
        
    for p in photo:
        total_score = 0
        for n in p:
            total_score += score_dict.get(n, 0)
        answer.append(total_score)
    return answer