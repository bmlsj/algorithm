def solution(spell, dic):

    for s in dic:
        if not set(spell) - set(s):
            return 1
    
    return 2