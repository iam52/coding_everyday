# 다른 사람의 풀이
def solution(numlist, n):
    answer = []
    answer = sorted(numlist, key=lambda x: (abs(x-n), -x))
    return answer

'''
abs(x-n)는 n으로부터의 가까운 순서대로 정렬하고 -x는 정렬된 수 중 거리가 같은 값이 나오면 더 큰 값을 먼저 정렬하도록 정의,
(sorted(key=는 첫번째 기준으로 값이 같을 때 두 번째 조건 적용)
그 후, 오름 차순으로 결과값 반환
'''
