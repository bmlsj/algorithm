mo = ['a', 'e', 'i', 'o', 'u']

while True:
    n = input()
    
    if n == '#':
        break
    
    cnt = 0
    for i in n:
        if i.lower() in mo:
            cnt += 1
    
    print(cnt)
    