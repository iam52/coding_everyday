# 다른 사람의 풀이
def solution(A, B):
    A, B = list(A), list(B)

    for i in range(len(A)):
        if A == B:
            return i
        temp = A.pop()
        A.insert(0, temp)
    return -1
'''
A와 B를 리스트로 만들고 A의 길이만큼 for 루프를 돌면서,
A와 B가 같으면 i를 바로 반환하고(i=0),
A에서 제일 뒤에 문자를 pop해서 A의 0번 인덱스에 삽입하면서 순환,
A가 B와 같아지면 i를 반환,
루프를 다 돌아도 맞지 않으면 -1 반환
'''
