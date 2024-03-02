def solution(emergency):
    answer = []
    ordered_emergency = sorted(emergency, reverse=True)
    for i in range(len(ordered_emergency)):
        answer.append(ordered_emergency.index(emergency[i]) + 1)
    return answer