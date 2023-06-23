from itertools import permutations
def is_prime(n):
    
    for i in range(2, n // 2 + 1):
        if n % i == 0:
            return False
    return True
    
def solution(numbers):
    
    cnt = 0
    for t in range(1, len(numbers) + 1):
        random_nums = list(permutations(numbers, t))

        num = set()
        for i in random_nums:
            n = ''.join(i)
            if n[0] != '0':
                num.add(int(n))
        
        print(num)
        for n in num:
            if is_prime(n) and n != 1:
                cnt += 1
        
    return cnt