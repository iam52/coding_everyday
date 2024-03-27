def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

def solution(a, b):
    # 기약분수로 만들기
    divisor = gcd(a, b)
    a //= divisor
    b //= divisor
    
    # 분모에 2와 5 이외의 수가 있는지 확인
    while b % 2 == 0:
        b //= 2
    while b % 5 == 0:
        b //= 5
    
    return 1 if b == 1 else 2