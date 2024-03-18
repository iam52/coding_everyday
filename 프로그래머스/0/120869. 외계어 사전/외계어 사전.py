def solution(spell, dic):
    answer = 0
    
    sorted_spell = sorted(spell)
    
    for word in dic:
        sorted_dic = sorted(word)
        if sorted_spell == sorted_dic:
            return 1
    return 2