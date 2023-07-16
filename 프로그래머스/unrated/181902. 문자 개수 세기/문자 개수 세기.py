def solution(my_string):
    
    alph = {i: 0 for i in range(52)}
    for s in my_string:
        if s.isupper():
            alph[ord(s) - ord('A')] += 1
        
        if s.islower():
            alph[ord(s) - ord('a') + 26] += 1
    
    return list(alph.values())