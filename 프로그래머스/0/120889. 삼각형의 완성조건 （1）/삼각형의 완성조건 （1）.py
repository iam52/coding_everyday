def solution(sides):
    answer = 0
    sides.sort()
    long = sides.pop()
    other1, other2 = sides[0], sides[1]

    if long < other1 + other2:
        answer = 1
    else:
        answer = 2
    return answer