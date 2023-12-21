# 다른 사람의 풀이
def solution(numlist, n):
    answer = []
    answer = sorted(numlist, key=lambda x: (abs(x-n), -x))
    return answer