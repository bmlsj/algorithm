str1, str2 = input().strip().split(' ')

def notsplit(s1, s2):
    
    res = ''
    for i in range(len(s1) + len(s2)):
        if i < len(s1):
            res += s1[i]
        else:
            res += s2[i - len(s1)]
    
    return res

print(notsplit(str1, str2))