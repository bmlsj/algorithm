def solution(n, numlist):
    
    # return [i for i in numlist if i%n == 0]
    return list(filter(lambda v: v%n==0, numlist))
        