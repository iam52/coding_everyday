def solution(num_list):
    answer = 0
    num_dict = {}
    for i in range(len(num_list)):
        num_dict[i+1] = num_list[i]

    even_sum = 0
    odd_sum = 0
    for idx, value in num_dict.items():
        if idx % 2 == 0:
            even_sum += value
        elif idx % 2 != 0:
            odd_sum += value

    if even_sum > odd_sum:
        answer = even_sum
    else:
        answer = odd_sum
    return answer