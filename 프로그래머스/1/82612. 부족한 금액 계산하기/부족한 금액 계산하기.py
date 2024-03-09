def solution(price, money, count):
    answer = -1
    nu_price = 0
    sum_price = 0
    for i in range(count):
        nu_price += price
        sum_price += nu_price
    answer = abs(sum_price - money)
    if money > sum_price:
        answer = 0
    return answer 