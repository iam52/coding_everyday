def solution(myString, pat):
    idx = myString[::-1].index(pat[::-1])
    return myString[:len(myString)-idx]