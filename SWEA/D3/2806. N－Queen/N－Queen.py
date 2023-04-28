
T = int(input())

for i in range(1, T+1):
    
    n = int(input())
    
    ans = 0
    row = [0] * n
    
    def is_promising(x):
        for i in range(x):
            if row[i] == row[x] or abs(row[x] - row[i]) == abs(x - i):
                return False
        return True
    
    def func(x):
        global ans
        if x == n:
            ans += 1
            return 
        
        else:
            for i in range(n):
                row[x] = i
                if is_promising(x):
                    func(x + 1)

    func(0)
    print(f"#{i} {ans}")