def solution(numer1, denom1, numer2, denom2):
    
    f = numer1 * denom2 + numer2 * denom1  # 분자
    r = denom1 * denom2  # 분모
    
    gcd = []
    j = f
    if f >= r:
        j = r
    
    for i in range(1, f+1):
        if f % i == 0 and r % i == 0:
            gcd.append(i)
    
    return [f/max(gcd), r/max(gcd)]