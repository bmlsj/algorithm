def solution(A,B):
    

    total = 0
    A = sorted(A)
    B = sorted(B, reverse=True)
    
    for _ in range(len(A)):
        a = A[0]
        b = B[0]
        print(a, b)
        total += (a*b)
        
        A.remove(a)
        B.remove(b)
    
    return total