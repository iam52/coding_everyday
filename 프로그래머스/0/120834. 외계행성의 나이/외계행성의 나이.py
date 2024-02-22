def solution(age):
    answer = ''
    nums = '0123456789'
    alphs = 'abcdefghij'

    nu_age = list(str(age))

    for i in range(len(nu_age)):
        if nu_age[i] == nums[int(nu_age[i])]:
            answer += alphs[int(nu_age[i])]
    return answer