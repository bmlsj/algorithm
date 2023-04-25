
t = int(input())

for i in range(1, t+1):
    
    a, b = map(int, input().split())
    total = a+b
    
    if total >= 24:
        total -= 24
        
    print("#{} {}".format(i, total))