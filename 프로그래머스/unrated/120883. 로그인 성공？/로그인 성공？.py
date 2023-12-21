# 챗지피티의 도움
def solution(id_pw, db):
    for i in db:
        if i == id_pw:
            return 'login'
        elif i[0] == id_pw[0] and i[-1] != id_pw[-1]:
            return 'wrong pw'
    return 'fail'
'''
기본적으로 fail을 반환하게 하고, 
db를 돌면서 i와 id_pw 모두 같으면 login 반환,
id만 같으면 wrong pw 반환
'''