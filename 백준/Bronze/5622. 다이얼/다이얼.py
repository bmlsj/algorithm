call = {'': 1, 'ABC': 2, 'DEF': 3, 'GHI': 4, 'JKL': 5, 'MNO': 6, 'PQRS': 7, 'TUV': 8,
        'WXYZ': 9}

s = input()
time = 0
keys = list(call.keys())
for i in s:
    for j in keys:
        if i in j:
            time += call[j]

print(time + len(s))