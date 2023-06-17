def div(str1):
    s1 = []

    for i in range(len(str1)-1):
        s = str1[i].upper() + str1[i+1].upper()
        if len(s) == 2 and s.isalpha():
            s1.append(s)
    
    return s1

def solution(str1, str2):

    s1, s2 = div(str1), div(str2)
    print(s1, s2)
    j = 0
    if len(s1) == 0 and len(s2) == 0:  # 모두 공집합일 경우
        j = 1
    else:
        inter = set(s1) | set(s2)
        intersection = []
        for i in inter:
            for _ in range(min(s1.count(i), s2.count(i))):
                intersection.append(i)
        
        uni = list(set(s1) | set(s2))
        union = []
        for i in uni:
            for _ in range(max(s1.count(i), s2.count(i))):
                union.append(i)
        print(intersection, union)
        j = len(intersection) / len(union)
        print(j)
        
    return int(j * 65536)
    # aa, aa  // aa, aa, aa