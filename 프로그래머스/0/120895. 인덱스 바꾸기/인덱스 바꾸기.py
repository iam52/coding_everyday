def solution(my_string, num1, num2):
    nu_list = list(my_string)
    nu_list[num1], nu_list[num2] = nu_list[num2], nu_list[num1]
    return ''.join(nu_list)