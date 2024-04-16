def solution(answers):
    answer = []
    cnt1 = 0
    cnt2 = 0
    cnt3 = 0
    math_quitter_1 = [1,2,3,4,5]
    math_quitter_2 = [2,1,2,3,2,4,2,5]
    math_quitter_3 = [3,3,1,1,2,2,4,4,5,5]

    for i in range(len(answers)):
        if answers[i] == math_quitter_1[i % len(math_quitter_1)]:
            cnt1 += 1
        if answers[i] == math_quitter_2[i % len(math_quitter_2)]:
            cnt2 += 1
        if answers[i] == math_quitter_3[i % len(math_quitter_3)]:
            cnt3 += 1

    if cnt1 == max(cnt1, cnt2, cnt3) and cnt2 == max(cnt1, cnt2, cnt3) and cnt3 == max(cnt1, cnt2, cnt3):
        answer.append(1)
        answer.append(2)
        answer.append(3)
    elif cnt1 == max(cnt1, cnt2, cnt3) and cnt2 == max(cnt1, cnt2, cnt3):
        answer.append(1)
        answer.append(2)
    elif cnt1 == max(cnt1, cnt2, cnt3) and cnt3 == max(cnt1, cnt2, cnt3):
        answer.append(1)
        answer.append(3)
    elif cnt2 == max(cnt1, cnt2, cnt3) and cnt3 == max(cnt1, cnt2, cnt3):
        answer.append(2)
        answer.append(3)
    else:
        if max(cnt1, cnt2, cnt3) == cnt1:
            answer.append(1)
        if max(cnt1, cnt2, cnt3) == cnt2:
            answer.append(2)
        if max(cnt1, cnt2, cnt3) == cnt3:
            answer.append(3)
    return answer