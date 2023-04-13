def solution(line):
    # [[2, -1, 4], [-2, -1, 4], [0, -1, 1], [5, -8, -12], [5, 8, 12]]

    xlist, ylist = [], []
    for i in range(len(line)):
        for j in range(i + 1, len(line)):
            a, b, e = line[i]
            c, d, f = line[j]

            if a * d - b * c:
                x = (b * f - e * d) / (a * d - b * c)
                y = (e * c - a * f) / (a * d - b * c)

                if x.is_integer() and y.is_integer():
                    xlist.append(int(x))
                    ylist.append(int(y))

    xmin, xmax, ymin, ymax = min(xlist), max(xlist), min(ylist), max(ylist)

    arr = [['.'] * (abs(xmax - xmin) + 1) for _ in range(abs(ymax - ymin) + 1)]
    star_list = []
    for i, j in zip(xlist, ylist):
        star_list.append((i, j))

    for s in star_list:
        a, b = s
        x, y = abs(ymax - b), abs(xmin - a)
        arr[x][y] = '*'
    
    ans = []
    for i in arr:
        ans.append(''.join(i))
    return ans