word = input().lower()  # 입력 받은 단어를 모두 소문자로 변환
count = [0] * 26  # 알파벳 개수를 저장할 리스트 초기화

# 각 알파벳의 등장 횟수를 count 리스트에 저장
for char in word:
    if char.isalpha():  # 알파벳인 경우에만 처리
        index = ord(char) - ord('a')  # 알파벳의 인덱스 계산
        count[index] += 1

max_count = max(count)  # 가장 많이 나온 알파벳의 개수

# 가장 많이 나온 알파벳의 개수를 가진 알파벳이 몇 개인지 확인
if count.count(max_count) > 1:
    print("?")  # 여러 개의 알파벳이 동일한 최대 개수를 가짐
else:
    max_index = count.index(max_count)  # 가장 많이 나온 알파벳의 인덱스
    print(chr(max_index + ord('a')).upper())  # 대문자로 출력
