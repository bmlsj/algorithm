def solution(quiz):
    
    c = ''
    num = ''
    ans = []

    for i in quiz:
        for j in range(len(i)):         
            if i[j] == '=':
                
                num = eval(c)

                if int(num) == int(i[j+2:]):
                    ans.append("O")
                else: 
                    ans.append("X")
                
                c = ''
                break               
                
            c += i[j]

    
    return ans