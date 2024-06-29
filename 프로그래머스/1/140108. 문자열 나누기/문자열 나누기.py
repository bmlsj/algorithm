def solution(s):

    idx = 0
    diff, same = 0, 1
    clist = []

    while idx < len(s):
        diff, same = 0, 1
        c = s[idx]
        start = s[idx]

        for i in range(idx + 1, len(s)):
            if diff != same and s[i] == start:
                same += 1
                c += s[i]

            elif diff != same and s[i] != start:
                diff += 1
                c += s[i]

            if diff == same:
                break

        idx += (same + diff)
        clist.append(c)

    return len(clist)