def solution(s, skip, index):
    skiplist = [ord(c) for c in skip]

    ans = []
    for c in s:
        afteridx = ord(c) + index
        endIdx = ord('z')
        startIdx = ord('a')

        i = ord(c) + 1
        while i <= afteridx:
            if i > endIdx:
                i -= 26
                afteridx -= 26
            
            if i in skiplist:
                afteridx += 1
            
            i += 1

        ans.append(chr(afteridx))

    return ''.join(ans)