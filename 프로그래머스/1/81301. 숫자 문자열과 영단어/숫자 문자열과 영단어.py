def solution(s):
    nums = {'one': '1', 'two': '2', 'three': '3', 'four': '4', 'five': '5', 'six': '6', 'seven': '7', 'eight': '8', 'nine': '9', 'zero': '0'}

    answer = s
    for k, v in nums.items():
        answer = answer.replace(k, v)
    return int(answer)