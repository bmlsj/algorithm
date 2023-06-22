def solution(elements):
    
    numlist = set()
    
    for i in range(1, len(elements)+1):
        for j in range(len(elements)):
            num = elements[j:i+j]
            if len(num) < i:
                num += elements[:i - len(num)]
            numlist.add(sum(num))
    
    return len(numlist)
    
    
            