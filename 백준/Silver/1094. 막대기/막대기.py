X = int(input()) # 23
mac = 64

sum_value = mac
l = [mac]
right_l = []

while sum_value > X:
    min_value = min(l)
    min_idx = l.index(min_value)

    l[min_idx] /= 2
    l.append(min_value/2)
    sum_value = sum(l[:-1]) + sum(right_l)

    if sum_value >= X:
        l.pop()

    else:   # sum(l) < X
        right_l.append(l[-1])
        l.pop()
        sum_value += sum(right_l)

result = len(right_l) + 1
print(result)