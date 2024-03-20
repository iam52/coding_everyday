def solution(id_pw, db):
    answer = ''
    id, pw = id_pw[0], id_pw[1]

    for i in db:
        if id == i[0] and pw == i[1]:
            answer = "login"
        elif id != i[0] and pw == i[1]:
            answer = "fail"
        elif id == i[0] and pw != i[1]:
            answer = "wrong pw"
            break
    return answer