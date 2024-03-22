def solution(rank, attendance):
    answer = 0
    temp = []
    for idx, value in enumerate(attendance):
        if value == True:
            temp.append(rank[idx])
            temp.sort()
    temp2 = []
    for i in temp[:3]:
        for j in range(len(rank)):
            if i == rank[j]:
                temp2.append(j)
    answer = temp2[0]*10000 + temp2[1]*100 + temp2[2]
    return answer