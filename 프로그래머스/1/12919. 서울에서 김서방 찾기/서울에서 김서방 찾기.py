def solution(seoul):
    answer = ''
    for location, Kim in enumerate(seoul):
        if Kim == 'Kim':
            answer = f"김서방은 {location}에 있다"
    return answer