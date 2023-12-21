# 챗지피티의 풀이
def solution(n):
    answer = 0
    count = 0
    
    while count < n:
        answer += 1
        if '3' in str(answer) or answer % 3 == 0:
            continue
        count += 1
    return answer
'''
answer는 3x 마을의 숫자, count는 3의 배수이거나 숫자 3이 포함되지 않았을 경우 1씩 증가,
count가 n 바로 앞 수가 될때까지 반복문을 돌면서 answer를 1씩 증가시키고,
만약 answer가 숫자 3을 포함하거나 3의 배수이면 count로 내려가지 않고 다음 반복문을 실행,
count가 n 바로 앞 수가 될때의 answer를 반환
'''