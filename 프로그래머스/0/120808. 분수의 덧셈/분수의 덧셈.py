def gcd(a, b):
    while b != 0:
        a, b = b, a % b
    return a

def lcm(a, b):
    return a * b // gcd(a, b)

def solution(numer1, denom1, numer2, denom2):
    com_denom = lcm(denom1, denom2)
    nu_numer1 = numer1 * (com_denom // denom1)
    nu_numer2 = numer2 * (com_denom // denom2)
    sum_numer = nu_numer1 + nu_numer2
    greatest_common_divisor = gcd(sum_numer, com_denom)
    answer = [sum_numer // greatest_common_divisor, com_denom // greatest_common_divisor]
    
    return answer
