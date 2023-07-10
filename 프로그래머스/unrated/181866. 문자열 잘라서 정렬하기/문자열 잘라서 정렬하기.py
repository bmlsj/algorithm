def solution(myString):
    
    ans = []
    for s in myString.split("x"):
        if s != '':
            ans.append(s)
    ans.sort()
    return ans