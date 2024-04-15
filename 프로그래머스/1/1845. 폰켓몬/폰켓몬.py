def solution(nums):
    answer = 0
    cnt = len(nums) // 2
    if len(set(nums)) > cnt:
        answer = cnt
    else:
        answer = len(set(nums))
    return answer