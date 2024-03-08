def solution(bin1, bin2):
    answer = ''
    temp = []

    for idx1, val1 in enumerate(bin1[::-1]):
        if val1 == '1':
            temp.append(2 ** idx1)

    for idx2, val2 in enumerate(bin2[::-1]):
        if val2 == '1':
            temp.append(2 ** idx2)

    num = sum(temp)
    bin = ''

    while num > 0:
        remain = num % 2
        bin = str(remain) + bin
        num //= 2
    answer = bin
    if bin1 == '0' and bin2 == '0':
        answer = '0'
    
    return answer