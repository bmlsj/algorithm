def solution(polynomial):
    poly = polynomial.split(' + ')
    x_list, num_list = [], []

    for i in poly:
        if 'x' in i:
            x_list.append(i)
        else:
            num_list.append(i)

    num_list = list(map(int, num_list))
    
    coef = sum(num_list)
    x_coef = 0
    
    for i in x_list:
        x = i.split('x')
        if x[0] == '':
            x_coef += 1
        else:
            x_coef += int(x[0])

    coef = str(coef)
    x = ''
    
    if x_coef == 1:
        x = 'x'
        
    if x_coef > 1:
        x = str(x_coef) + 'x'
        
    if coef == '0' and x_coef == 0:
        return '0'
    if x_coef == 0:
        return coef
    if coef == '0':
        return x
    
    return x + " + " + coef


