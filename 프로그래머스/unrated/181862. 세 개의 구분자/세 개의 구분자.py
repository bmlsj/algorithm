def solution(myStr):

    ans = []
    for my in myStr.split('a'):
        for m in my.split('b'):
            if (m.split('c')) != '':
                ans.append(m.split('c'))
    
    ans = [a for an in ans for a in an if a != '']
    return ans if ans else ["EMPTY"]