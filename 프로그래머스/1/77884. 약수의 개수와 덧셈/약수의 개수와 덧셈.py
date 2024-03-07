def solution(left, right):
    answer = 0
    for i in range(left, right+1):
        # 수 i의 약수 개수를 구함
        count = 0
        for j in range(1, i+1):
            if i % j == 0:
                count += 1

        # 약수 개수가 짝수인지 홀수인지에 따라 연산을 처리
        if count % 2 == 0:
            answer += i
        else:
            answer -= i
    return answer