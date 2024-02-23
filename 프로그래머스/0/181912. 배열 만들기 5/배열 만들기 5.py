def solution(intStrs, k, s, l):
    answer = []
    for i in intStrs:
        nu_int = int(i[s:s+l])
        if nu_int > k:
            answer.append(nu_int)
    return answer