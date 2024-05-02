# 단어 개수 입력 받기
N = int(input())

# 그룹 단어 카운트 변수
group_word_count = 0

for _ in range(N):
    word = input()
    # 방문한 문자를 저장할 집합 선언
    visited = set()
    is_group_word = True

    prev_char = ''
    for char in word:
        # 현재 문자가 이전과 다르고, 방문한적이 있는 경우
        if char != prev_char and char in visited:
            is_group_word = False
            break
        # 처음 방문한 문자면 집합에 추가
        visited.add(char)
        prev_char = char
    
    # 모든 검사를 통과하면 그룹 단어 카운트 증가
    if is_group_word:
        group_word_count += 1

# 그룹 단어 개수 출력
print(group_word_count)
